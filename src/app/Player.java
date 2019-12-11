package app;

import app.Actor;

class Player extends Actor {
    int lives = 3;

    Player (String name) {
        super(name, 0, 0);
        health = 100;
    }

    Player (String name, int x, int y) {
        super(name, x, y);
        health = 100;
    }

    void die() {
        super.die();
        lives -= 1;
        health = 100;
        System.out.println(name + " has " + lives + " lives remaining");
    }
}