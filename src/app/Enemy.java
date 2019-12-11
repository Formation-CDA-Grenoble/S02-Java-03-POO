package app;

import app.Actor;

class Enemy extends Actor {
    int loot = 100;

    Enemy(String name) {
        super(name, 0, 0);
        health = 20;
    }

    Enemy(String name, int x, int y) {
        super(name, x, y);
        health = 20;
    }
}