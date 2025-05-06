package com.herobook.view;

import com.herobook.controller.GameController;
import com.herobook.model.Chapter;
import com.herobook.model.Choice;

import javax.swing.*;
import java.awt.*;

public class SwingUI extends JFrame {
    private GameController gameController;
    private JTextArea storyArea;
    private JPanel choicesPanel;
    private JPanel statsPanel;

    public SwingUI(GameController gameController) {
        this.gameController = gameController;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Livre dont vous êtes le héros");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Story area
        storyArea = new JTextArea();
        storyArea.setEditable(false);
        storyArea.setLineWrap(true);
        storyArea.setWrapStyleWord(true);
        JScrollPane storyScrollPane = new JScrollPane(storyArea);
        add(storyScrollPane, BorderLayout.CENTER);

        // Choices panel
        choicesPanel = new JPanel();
        choicesPanel.setLayout(new BoxLayout(choicesPanel, BoxLayout.Y_AXIS));
        JScrollPane choicesScrollPane = new JScrollPane(choicesPanel);
        choicesScrollPane.setPreferredSize(new Dimension(300, 0));
        add(choicesScrollPane, BorderLayout.EAST);

        // Stats panel
        statsPanel = new JPanel();
        statsPanel.setLayout(new BoxLayout(statsPanel, BoxLayout.Y_AXIS));
        statsPanel.setBorder(BorderFactory.createTitledBorder("Statistiques"));
        add(statsPanel, BorderLayout.NORTH);

        updateUI();
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
                choiceButton.addActionListener(e -> {
                    gameController.makeChoice(choiceIndex);
                    updateUI();
                });
                choicesPanel.add(choiceButton);
                choicesPanel.add(Box.createVerticalStrut(10));
            }
            choicesPanel.revalidate();
            choicesPanel.repaint();

            // Update stats
            statsPanel.removeAll();
            statsPanel.add(new JLabel("Santé: " + gameController.getPlayer().getHealth()));
            statsPanel.add(new JLabel("Force: " + gameController.getPlayer().getStrength()));
            statsPanel.add(new JLabel("Inventaire: " + String.join(", ", gameController.getPlayer().getInventory())));
            statsPanel.revalidate();
            statsPanel.repaint();
        }

        if (gameController.isGameOver()) {
            storyArea.append("\n\nFin de l'histoire!");
            choicesPanel.removeAll();
            JButton restartButton = new JButton("Recommencer");
            restartButton.addActionListener(e -> {
                // TODO: Implement restart functionality
            });
            choicesPanel.add(restartButton);
            choicesPanel.revalidate();
            choicesPanel.repaint();
        }
    }
} 