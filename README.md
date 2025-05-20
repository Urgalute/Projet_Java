# Documentation Technique - Un livre dont vous êtes le héros
----------------------------------------

Le livre utilisé pour le jeu est : L'antre des dragons  
Trouvable à ce lien : https://bibl.remz.ca/quete_du_graal-8/Qu%C3%AAte%20du%20Graal%202%20-%20L'antre%20des%20dragons.pdf  


## Décision du concept
-------------------

Pour le concept, nous avons décidé de rester le plus fidèle possible au principe même des livres.  
C'est à dire donner la même expérience que la version papier, mais en digital.  
    - Deux dés de 6 accessible à tout instant, une zone de prise de note.  
    - Un libre choix d'explorer le livre et de tricher sur les combats pour pouvoir continuer sans être frustré.  

## Réalisation
------------

Ce projet à été réalisé par Commeau Yoan et Dupin Alexis.

Le langage utilisé est le Java et l'interface graphique est en Swing.

## Architecture du Projet
-----------------------

Le projet est organisé selon une architecture MVC (Modèle-Vue-Contrôleur) :

- **Modèle** : `com.herobook.model`
  - `Chapter` : Représente un chapitre du livre
  - `Choice` : Représente un choix possible dans un chapitre
  - `Scenario` : Contient l'ensemble des chapitres
  - `Dice` : Gère le système de dés

- **Vue** : `com.herobook.view`
  - `SwingUI` : Interface graphique principale du jeu
  - `MainMenu` : Menu principal du jeu

- **Contrôleur** : `com.herobook.controller`
  - `GameController` : Gère la logique du jeu

## Fonctionnement des Classes Principales
--------------------------------------

### Chapter
--------
```java
public class Chapter {
    private String id;          // Identifiant unique du chapitre
    private String title;       // Titre du chapitre
    private String content;     // Contenu textuel du chapitre
    private List<Choice> choices; // Liste des choix possibles
}
```

### Choice
--------
```java
public class Choice {
    private String text;           // Texte du choix
    private String nextChapterId;  // ID du prochain chapitre
}
```

### Scenario
----------
```java
public class Scenario {
    private String title;           // Titre du scénario
    private String description;     // Description du scénario
    private Map<String, Chapter> chapters; // Map des chapitres
}
```

## Comment Ajouter un Nouveau Chapitre
----------------------------------

Pour ajouter un nouveau chapitre au jeu, suivez ces étapes :

1. **Créer le chapitre** :
```java
Chapter newChapter = new Chapter(
    "ID_DU_CHAPITRE",  // Par exemple "1", "2", etc.
    "Titre du chapitre",
    "Contenu du chapitre..."
);
```

2. **Ajouter des choix** :
```java
newChapter.addChoice(new Choice(
    "Texte du choix",  // Ce que le joueur verra
    "ID_CHAPITRE_SUIVANT"  // ID du chapitre vers lequel ce choix mène
));
```

3. **Ajouter le chapitre au scénario** :
```java
scenario.addChapter(newChapter);
```

### Exemple Complet
----------------
```java
// Création d'un nouveau chapitre
Chapter chapter1 = new Chapter(
    "1",
    "Le Début de l'Aventure",
    "Vous vous réveillez dans une forêt mystérieuse..."
);

// Ajout des choix
chapter1.addChoice(new Choice("Explorer la forêt", "2"));
chapter1.addChoice(new Choice("Retourner au village", "3"));

// Ajout au scénario
scenario.addChapter(chapter1);
```

## Système de Sauvegarde
---------------------

Le système de sauvegarde est géré par la classe `SaveManager`. Il sauvegarde :
- Le numéro du chapitre actuel
- La progression du joueur

Pour sauvegarder manuellement :
```java
saveManager.saveGame(chapterId);
```

Pour charger une sauvegarde :
```java
int savedChapter = saveManager.loadGame();
```

## Interface Utilisateur
---------------------

L'interface utilisateur (`SwingUI`) est divisée en plusieurs sections :

1. **Zone de texte principale** : Affiche le contenu du chapitre actuel
2. **Panneau des choix** : Affiche les choix disponibles
3. **Zone de notes** : Permet au joueur de prendre des notes
4. **Panneau des dés** : Permet de lancer les dés et de sauvegarder

## Système de Dés
--------------

Le système de dés est implémenté dans la classe `Dice` :
```java
public static int[] rollTwoDice() {
    // Retourne un tableau de deux entiers entre 1 et 6
    return new int[] { roll(), roll() };
}
```

## Bonnes Pratiques pour l'Ajout de Contenu
----------------------------------------

1. **Organisation des IDs** :
   - Utilisez des IDs numériques séquentiels
   - Évitez les IDs trop longs ou complexes
   - Documentez les connexions entre les chapitres

2. **Contenu des chapitres** :
   - Gardez un style cohérent
   - Assurez-vous que chaque choix mène à un chapitre valide
   - Testez tous les chemins possibles

3. **Choix** :
   - Proposez des choix clairs et distincts
   - Évitez les choix qui mènent à des impasses
   - Assurez-vous que chaque choix a une conséquence

## Débogage
---------

Pour déboguer le jeu :
1. Vérifiez les IDs des chapitres
2. Assurez-vous que tous les choix mènent à des chapitres existants
3. Testez le système de sauvegarde
4. Vérifiez que les dés fonctionnent correctement

## Extensions Possibles
--------------------

Le jeu peut être étendu avec :
1. Un système de points de vie
2. Un inventaire
3. Des objets spéciaux
4. Des combats
5. Des énigmes

Pour ajouter ces fonctionnalités, il faudra modifier les classes existantes et ajouter de nouvelles classes selon les besoins. 

## Nos Echecs
----------

1. Implémentation des images du livre dans le jeu.
2. Système de gestion de l'inventaire.
3. Une interface graphique plus agréable.
