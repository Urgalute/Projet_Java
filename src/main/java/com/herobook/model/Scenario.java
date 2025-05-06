package com.herobook.model;

import java.util.HashMap;
import java.util.Map;

public class Scenario {
    private String title;
    private String description;
    private Map<String, Chapter> chapters;
    private String startChapterId;

    public Scenario(String title, String description) {
        this.title = title;
        this.description = description;
        this.chapters = new HashMap<>();
    }

    public void addChapter(Chapter chapter) {
        chapters.put(chapter.getId(), chapter);
    }

    public void setStartChapterId(String startChapterId) {
        this.startChapterId = startChapterId;
    }

    public Chapter getChapter(String chapterId) {
        return chapters.get(chapterId);
    }

    public Chapter getStartChapter() {
        return chapters.get(startChapterId);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
} 