package app;

import app.Actor;

// Classe représentant le joueur
// Elle "hérite" de toutes les propriétés et méthodes de la classe Actor,
// et elle rajoute les siennes, qui lui sont propres
class Player extends Actor {
    // Nombre de vies du joueur
    int lives = 3;

    // Constructeur
    // Si on passe uniquement un nom au joueur lors de sa création, il est
    // placé à la position 0, 0
    Player (String name) {
        super(name, 0, 0);
        health = 100;
    }

    // Constructeur
    // Si on passe un nom et une position au joueur lors de sa création, il
    // est placé à cette position
    Player (String name, int x, int y) {
        super(name, x, y);
        health = 100;
    }

    // Actions spécifiques à exécuter quand le personnage a perdu tous ses
    // points de vie
    void die() {
        // Exécute d'abord les actions définies dans la méthode "die" de la
        // classe Actor
        super.die();
        // Perd une vie
        lives -= 1;
        // Ramène la santé à son niveau de départ
        health = 100;
        // Affiche un retour utilisateur
        System.out.println(name + " has " + lives + " lives remaining");
    }
}