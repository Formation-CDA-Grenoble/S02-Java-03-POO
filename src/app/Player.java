package app;

class Player {
    final int DIRECTION_UP = 0;
    final int DIRECTION_RIGHT = 1;
    final int DIRECTION_DOWN = 2;
    final int DIRECTION_LEFT = 3;

    int x;
    int y;
    int health;
    int direction;

    // Déplace la personnage vers l'avant
    void moveForward() {

    }

    // Tourne le personnage de 90° vers la gauche
    void turnLeft() {
        direction -= 1;
        if (direction < DIRECTION_UP) {
            direction = DIRECTION_LEFT;
        }
    }

    // Tourne le personnage de 90° vers la droite
    void turnRight() {
        direction += 1;
        if (direction > DIRECTION_LEFT) {
            direction = DIRECTION_UP;
        }
    }
}