package com.herobook;

import com.herobook.controller.GameController;
import com.herobook.model.*;
import com.herobook.view.SwingUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a sample scenario
        Scenario scenario = createSampleScenario();

        // Create and setup the game controller
        GameController gameController = new GameController();
        gameController.loadScenario(scenario);

        // Launch the UI
        SwingUtilities.invokeLater(() -> {
            SwingUI ui = new SwingUI(gameController);
            ui.setVisible(true);
        });
    }

    private static Scenario createSampleScenario() {
        Scenario scenario = new Scenario("L'Aventure du Héros", "Une aventure épique vous attend!");

        // Chapter 1
        Chapter chapter1 = new Chapter("ch1", "Le Début de l'Aventure", 
            "Vous vous réveillez dans une forêt mystérieuse. Le soleil commence à se coucher et vous entendez des bruits étranges.");
        chapter1.addChoice(new Choice("Explorer les environs", "ch2"));
        chapter1.addChoice(new Choice("Chercher un abri", "ch3"));

        // Chapter 2
        Chapter chapter2 = new Chapter("ch2", "La Découverte", 
            "En explorant, vous trouvez une vieille cabane abandonnée. Une lueur étrange en émane.");
        chapter2.addChoice(new Choice("Entrer dans la cabane", "ch4"));
        chapter2.addChoice(new Choice("Continuer à explorer", "ch5"));

        // Chapter 3
        Chapter chapter3 = new Chapter("ch3", "L'Abri", 
            "Vous trouvez une grotte qui semble sûre. À l'intérieur, vous découvrez un vieux grimoire.");
        chapter3.addChoice(new Choice("Lire le grimoire", "ch6"));
        chapter3.addChoice(new Choice("Dormir", "ch7"));

        // Add chapters to scenario
        scenario.addChapter(chapter1);
        scenario.addChapter(chapter2);
        scenario.addChapter(chapter3);

        // Set the starting chapter
        scenario.setStartChapterId("ch1");

        return scenario;
    }
} 