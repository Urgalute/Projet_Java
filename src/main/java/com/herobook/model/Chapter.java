package com.herobook.model;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String id;
    private String title;
    private String content;
    private List<Choice> choices;

    public Chapter(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.choices = new ArrayList<>();
    }

    public void addChoice(Choice choice) {
        choices.add(choice);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<Choice> getChoices() {
        return choices;
    }
} 