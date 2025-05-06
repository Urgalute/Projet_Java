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
        Chapter chapter1 = new Chapter("5", "Le Début de l'Aventure",
            "5\n" +
                    "Les bois semblent se refermer sur vous quand vous y pénétrez. Au bout de\n" +
                    "quelques instants le sentier disparaît, et vous en êtes réduit à vous frayer un chemin\n" +
                    "de votre mieux parmi les taillis, les buissons et les ronces. La progression est de\n" +
                    "plus en plus difficile , de plus en plus tortueuse, et vous finissez par vous rendre\n" +
                    "compte que vous êtes complètement perdu. Vous vous arrêtez un instant, et vous\n" +
                    "vous grattez le sommet du crâne. Ce geste n'améliorant en rien votre situation, vous\n" +
                    "prenez la seule décision possible : lancer deux dés pour voir si vous pouvez vous\n" +
                    "sortir de là.\n" +
                    "Si vous faites :\n" +
                    "de 2 à 6 : rendez-vous au 31.\n" +
                    "de 7 à 12 : rendez-vous au 17.");
        chapter1.addChoice(new Choice("Page 31", "31"));
        chapter1.addChoice(new Choice("Page 17", "17"));

        // Chapter 2
        Chapter chapter2 = new Chapter("31", "",
            "31\n" +
                    "rien à faire, encore perdu. Lancez les dés de nouveau\n" +
                    "SI VOUS faites :\n" +
                    "de 2 à 6 : rendez-vous au 17.\n" +
                    "de 7 à 12 : rendez-vous au 73.");
        chapter2.addChoice(new Choice("Page 17", "17"));
        chapter2.addChoice(new Choice("Page 73", "73"));

        // Chapter 3
        Chapter chapter3 = new Chapter("17", "",
            "17\n" +
                    "Désolé, mais vous semblez toujours complètement perdu. Lancez les dés de nouveau.\n" +
                    "Si vous faites :\n" +
                    "de 2 à 6 : rendez-vous au 73.\n" +
                    "de 7 à 12 : rendez-vous au 82.");
        chapter3.addChoice(new Choice("Page 73", "73"));
        chapter3.addChoice(new Choice("Page 82", "82"));

        Chapter chapter4 = new Chapter("73", "",
                "73\n" +
                        "Voilà qui est un peu mieux, Pip. Guère mieux, mais quand même. Les arbres semblent\n" +
                        "un peu moins denses par ici... Allons bon, voilà que vous tombez sur un Troll. Quel\n" +
                        "vilain petit bonhomme, en plus. Les bois en sont pleins à cette époque de l'année, cela\n" +
                        "n'a donc rien de bien surprenant, mais cela n'en est pas moins fâcheux, les Trolls étant\n" +
                        "ce qu'ils sont. Les Trolls des Bois en tout cas. Ils sont parfaitement immunisés au\n" +
                        "métal, il est donc inutile de les attaquer avec votre épée ou d'autres armes. (« Parfaite-\n" +
                        "ment inutile », marmonne E.J.) Mais si vous ne l'at taquez pas, il va vous dépouiller de\n" +
                        "tous vos biens. Il vous volera tout ce que vous possédez, (sauf l'armure et les armes) si\n" +
                        "vous n'intervenez pas rapidement. En fait, vous n'avez le choix qu'entre trois solutions.\n" +
                        "Vous pouvez le noyer dans votre gourde à eau. (Vous en avez bien emporté une, n'est-\n" +
                        "ce pas ?) L'eau prendra par la suite un goût bizarre mais c'est à prévoir. Ou alors, si\n" +
                        "vous n'avez pas emporté de gourde, vous pouvez l'assommer d'un coup sur la tete avec\n" +
                        "vos bottes de rechange. (Vous avez bien emporté des bottes de rechange, n'est-ce pas\n" +
                        "?) Ou si vous n'avez emporté ni gourde à eau ni bottes de rechange, vous pouvez\n" +
                        "l'ensorceler en jouant du luth ou de la harpe. (Vous avez bien emporté un luth et une\n" +
                        "harpe, n'est-ce pas ?)\n" +
                        "Si vous ne possédez pas le matériel nécessaire pour neutraliser le Troll des Bois, vous\n" +
                        "ne possédez plus que vos armes et votre armure. Mettez à jour votre Feuille\n" +
                        "d'Aventure. Dans tous les cas, rendez-vous au 11");
        chapter3.addChoice(new Choice("Lire le grimoire", "ch6"));
        chapter3.addChoice(new Choice("Dormir", "ch7"));

        // Add chapters to scenario
        scenario.addChapter(chapter1);
        scenario.addChapter(chapter2);
        scenario.addChapter(chapter3);
        scenario.addChapter(chapter4);

        // Set the starting chapter
        scenario.setStartChapterId("5");

        return scenario;
    }
} 