package com;

import java.io.*;
import java.nio.file.*;

public class SaveManager {
    private static final String SAVE_FILE = "save.dat";

    public void saveGame(int chapter) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(SAVE_FILE))) {
            oos.writeInt(chapter);
            System.out.println("Partie sauvegardée au chapitre " + chapter);
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde : " + e.getMessage());
        }
    }

    public int loadGame() {
        if (!Files.exists(Paths.get(SAVE_FILE))) {
            return -1;
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(SAVE_FILE))) {
            return ois.readInt();
        } catch (IOException e) {
            System.out.println("Erreur lors du chargement : " + e.getMessage());
            return -1;
        }
    }
} 