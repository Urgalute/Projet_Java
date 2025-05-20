package com.herobook.controller;

import com.herobook.model.*;

public class GameController {
    private Scenario currentScenario;
    private Chapter currentChapter;
    private Player player;

    public GameController() {
        this.player = new Player("Hero");
    }

    public void loadScenario(Scenario scenario) {
        this.currentScenario = scenario;
        this.currentChapter = scenario.getStartChapter();
    }

    public void makeChoice(int choiceIndex) {
        if (currentChapter != null && choiceIndex >= 0 && choiceIndex < currentChapter.getChoices().size()) {
            Choice choice = currentChapter.getChoices().get(choiceIndex);
            currentChapter = currentScenario.getChapter(choice.getNextChapterId());
        }
    }

    public Chapter getCurrentChapter() {
        return currentChapter;
    }

    public void setCurrentChapter(int chapterId) {
        if (currentScenario != null) {
            this.currentChapter = currentScenario.getChapter(String.valueOf(chapterId));
        }
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isGameOver() {
        return currentChapter == null || currentChapter.getChoices().isEmpty();
    }
} 