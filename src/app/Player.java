package app;

import app.Actor;

class Player extends Actor {
    int lives = 3;

    Player (String name) {
        super(name, 0, 0);
    }

    Player (String name, int x, int y) {
        super(name, x, y);
    }
}