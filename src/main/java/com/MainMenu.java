package com;

import javax.swing.*;
import java.awt.*;
import com.herobook.controller.GameController;
import com.herobook.model.Scenario;
import com.herobook.view.SwingUI;

public class MainMenu extends JFrame {
    private static final int STARTING_CHAPTER = 175;
    private SaveManager saveManager;

    public MainMenu() {
        this.saveManager = new SaveManager();
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Livre dont vous êtes le héros - Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Livre dont vous êtes le héros");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(30));

        JButton newGameButton = new JButton("Nouvelle partie");
        newGameButton.setFont(new Font("Arial", Font.PLAIN, 16));
        newGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        newGameButton.addActionListener(e -> startNewGame());
        mainPanel.add(newGameButton);
        mainPanel.add(Box.createVerticalStrut(15));

        JButton loadGameButton = new JButton("Charger une partie");
        loadGameButton.setFont(new Font("Arial", Font.PLAIN, 16));
        loadGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadGameButton.addActionListener(e -> loadGame());
        mainPanel.add(loadGameButton);
        mainPanel.add(Box.createVerticalStrut(15));

        JButton quitButton = new JButton("Quitter");
        quitButton.setFont(new Font("Arial", Font.PLAIN, 16));
        quitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        quitButton.addActionListener(e -> quitGame());
        mainPanel.add(quitButton);

        add(mainPanel);
    }

    private void startNewGame() {
        // Créer le scénario
        Scenario scenario = createSampleScenario();

        // Créer le gamecontroller
        GameController gameController = new GameController();
        gameController.loadScenario(scenario);
        gameController.setCurrentChapter(STARTING_CHAPTER);

        // Sauvegarder le point de départ
        saveManager.saveGame(STARTING_CHAPTER);

        // Lancer le jeu
        SwingUI gameUI = new SwingUI(gameController);
        gameUI.setVisible(true);
        this.dispose(); // Fermer le menu
    }

    private void loadGame() {
        int savedChapter = saveManager.loadGame();
        if (savedChapter != -1) {
            // Créer le scénario
            Scenario scenario = createSampleScenario();

            // Créer le gamecontroller
            GameController gameController = new GameController();
            gameController.loadScenario(scenario);
            gameController.setCurrentChapter(savedChapter);

            // Lancer le jeu
            SwingUI gameUI = new SwingUI(gameController);
            gameUI.setVisible(true);
            this.dispose(); // Fermer le menu
        } else {
            JOptionPane.showMessageDialog(this,
                "Aucune sauvegarde trouvée.",
                "Erreur",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    private void quitGame() {
        int choice = JOptionPane.showConfirmDialog(this,
            "Voulez-vous sauvegarder avant de quitter ?",
            "Quitter",
            JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Sauvegarder le chapitre actuel
            saveManager.saveGame(STARTING_CHAPTER); // TODO: Récupérer le chapitre actuel
            System.exit(0);
        } else if (choice == JOptionPane.NO_OPTION) {
            System.exit(0);
        }
        // Si CANCEL, ne rien faire
    }

    private Scenario createSampleScenario() {
        // Cette méthode devrait être déplacée dans une classe appropriée
        // Pour l'instant, nous utilisons celle de Main.java
        return com.herobook.Main.createSampleScenario();
    }
} 