package com.herobook.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int strength;
    private List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.strength = 10;
        this.inventory = new ArrayList<>();
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public void removeItem(String item) {
        inventory.remove(item);
    }

    public void modifyHealth(int amount) {
        this.health = Math.max(0, Math.min(100, this.health + amount));
    }

    public void modifyStrength(int amount) {
        this.strength = Math.max(0, this.strength + amount);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> getInventory() {
        return new ArrayList<>(inventory);
    }
} 