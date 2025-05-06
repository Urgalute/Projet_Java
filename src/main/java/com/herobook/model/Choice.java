package com.herobook.model;

public class Choice {
    private String text;
    private String nextChapterId;

    public Choice(String text, String nextChapterId) {
        this.text = text;
        this.nextChapterId = nextChapterId;
    }

    // Getters
    public String getText() {
        return text;
    }

    public String getNextChapterId() {
        return nextChapterId;
    }
} 