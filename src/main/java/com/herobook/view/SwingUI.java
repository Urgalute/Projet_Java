package com.herobook.view;

import com.herobook.controller.GameController;
import com.herobook.model.Chapter;
import com.herobook.model.Choice;
import com.herobook.model.Dice;
import com.SaveManager;

import javax.swing.*;
import java.awt.*;

public class SwingUI extends JFrame {
    private GameController gameController;
    private JTextArea storyArea;
    private JPanel choicesPanel;
    private JPanel dicePanel;
    private JLabel diceResultLabel;
    private JTextArea inputArea;
    private SaveManager saveManager;
    private static final Font DEFAULT_FONT = new Font("Arial", Font.PLAIN, 16);
    private static final Font TITLE_FONT = new Font("Arial", Font.BOLD, 18);

    public SwingUI(GameController gameController) {
        this.gameController = gameController;
        this.saveManager = new SaveManager();
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Livre dont vous êtes le héros");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                quitGame();
            }
        });
        setSize(1000, 800);
        setLayout(new BorderLayout());

        // Story area
        storyArea = new JTextArea();
        storyArea.setEditable(false);
        storyArea.setLineWrap(true);
        storyArea.setWrapStyleWord(true);
        storyArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        storyArea.setAlignmentY(Component.CENTER_ALIGNMENT);
        storyArea.setMargin(new Insets(20, 20, 20, 20));
        storyArea.setFont(DEFAULT_FONT);
        JScrollPane storyScrollPane = new JScrollPane(storyArea);
        add(storyScrollPane, BorderLayout.CENTER);

        // Right panel (choices + input field)
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        
        // Input area
        inputArea = new JTextArea();
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);
        inputArea.setPreferredSize(new Dimension(300, 400));
        inputArea.setMaximumSize(new Dimension(300, 400));
        inputArea.setFont(DEFAULT_FONT);
        JScrollPane inputScrollPane = new JScrollPane(inputArea);
        rightPanel.add(inputScrollPane);
        rightPanel.add(Box.createVerticalStrut(10));

        // Choices panel with two columns
        choicesPanel = new JPanel();
        choicesPanel.setLayout(new GridLayout(0, 2, 10, 10)); // 2 columns, 10px gaps
        JScrollPane choicesScrollPane = new JScrollPane(choicesPanel);
        choicesScrollPane.setPreferredSize(new Dimension(300, 300));
        rightPanel.add(choicesScrollPane);
        
        JScrollPane rightScrollPane = new JScrollPane(rightPanel);
        rightScrollPane.setPreferredSize(new Dimension(300, 0));
        add(rightScrollPane, BorderLayout.EAST);

        // Top panel (dice)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));

        // Dice panel
        dicePanel = new JPanel();
        dicePanel.setLayout(new BoxLayout(dicePanel, BoxLayout.Y_AXIS));
        dicePanel.setBorder(BorderFactory.createTitledBorder("Dés"));
        dicePanel.setFont(DEFAULT_FONT);
        
        JButton rollDiceButton = new JButton("Lancer les dés");
        rollDiceButton.setFont(DEFAULT_FONT);
        rollDiceButton.addActionListener(e -> rollDice());
        
        diceResultLabel = new JLabel("Résultat: -");
        diceResultLabel.setFont(DEFAULT_FONT);
        diceResultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        dicePanel.add(rollDiceButton);
        dicePanel.add(Box.createVerticalStrut(10));
        dicePanel.add(diceResultLabel);
        
        // Save button
        JButton saveButton = new JButton("Sauvegarder");
        saveButton.setFont(DEFAULT_FONT);
        saveButton.addActionListener(e -> saveGame());
        dicePanel.add(Box.createVerticalStrut(10));
        dicePanel.add(saveButton);
        
        topPanel.add(Box.createHorizontalStrut(20));
        topPanel.add(dicePanel);
        
        add(topPanel, BorderLayout.NORTH);

        updateUI();
    }

    private void saveGame() {
        Chapter currentChapter = gameController.getCurrentChapter();
        if (currentChapter != null) {
            saveManager.saveGame(Integer.parseInt(currentChapter.getId()));
            JOptionPane.showMessageDialog(this,
                "Partie sauvegardée au chapitre " + currentChapter.getId(),
                "Sauvegarde",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void quitGame() {
        int choice = JOptionPane.showConfirmDialog(this,
            "Voulez-vous sauvegarder avant de quitter ?",
            "Quitter",
            JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            saveGame();
            System.exit(0);
        } else if (choice == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
        // Si CANCEL, ne rien faire
    }

    private void rollDice() {
        int[] dice = Dice.rollTwoDice();
        diceResultLabel.setText(String.format("Résultat: %d + %d = %d", dice[0], dice[1], dice[0] + dice[1]));
    }

    public void updateUI() {
        Chapter currentChapter = gameController.getCurrentChapter();
        if (currentChapter != null) {
            // Update story
            storyArea.setText(currentChapter.getTitle() + "\n\n" + currentChapter.getContent());

            // Update choices
            choicesPanel.removeAll();
            for (int i = 0; i < currentChapter.getChoices().size(); i++) {
                final int choiceIndex = i;
                Choice choice = currentChapter.getChoices().get(i);
                JButton choiceButton = new JButton(choice.getText());
                choiceButton.setFont(DEFAULT_FONT);
                choiceButton.addActionListener(e -> {
                    gameController.makeChoice(choiceIndex);
                    updateUI();
                });
                choicesPanel.add(choiceButton);
            }
            choicesPanel.revalidate();
            choicesPanel.repaint();
        }

        if (gameController.isGameOver()) {
            storyArea.append("\n\nFin de l'histoire!");
            choicesPanel.removeAll();
            JButton restartButton = new JButton("Recommencer");
            restartButton.setFont(DEFAULT_FONT);
            restartButton.addActionListener(e -> {
                // TODO: Implement restart functionality
            });
            choicesPanel.add(restartButton);
            choicesPanel.revalidate();
            choicesPanel.repaint();
        }
    }
}