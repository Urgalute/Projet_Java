package com.herobook.model;

import java.util.Random;

public class Dice {
    private static final Random random = new Random();
    
    public static int[] rollTwoDice() {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return new int[]{die1, die2};
    }
} 