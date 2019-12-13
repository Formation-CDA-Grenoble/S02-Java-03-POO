package app;

import app.Actor;

// Classe représentant un monstre
// Elle "hérite" de toutes les propriétés et méthodes de la classe Actor,
// et elle rajoute les siennes, qui lui sont propres
class Enemy extends Actor {
    // Nombre de points à faire gagner au joueur lorsque le monstre est tué
    int loot = 100;

    // Constructeur
    // Si on passe uniquement un nom au monstre lors de sa création, il est
    // placé à la position 0, 0
    Enemy(String name) {
        super(name, 0, 0);
        health = 20;
    }

    // Constructeur
    // Si on passe un nom et une position au monstre lors de sa création, il
    // est placé à cette position
    Enemy(String name, int x, int y) {
        super(name, x, y);
        health = 20;
    }

    // Actions spécifiques à exécuter quand le monstre a perdu tous ses
    // points de vie
    void die() {
        // Exécute d'abord les actions définies dans la méthode "die" de la
        // classe Actor
        super.die();
        // Affiche un retour utilisateur
        System.out.println(name + " gives " + loot + " points");
    }
}