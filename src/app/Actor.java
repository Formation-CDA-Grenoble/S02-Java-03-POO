package app;

class Actor {
    final int DIRECTION_UP = 0;
    final int DIRECTION_RIGHT = 1;
    final int DIRECTION_DOWN = 2;
    final int DIRECTION_LEFT = 3;
    final String[] DIRECTION_NAMES = new String[] {"up", "right", "down", "left"};

    String name;
    int x;
    int y;
    int health;
    int direction;

    Actor(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    // Déplace la personnage vers l'avant
    void moveForward() {
        if (direction == DIRECTION_UP) {
            y -= 1;
        } else if (direction == DIRECTION_RIGHT) {
            x += 1;
        } else if (direction == DIRECTION_DOWN) {
            y += 1;
        } else if (direction == DIRECTION_LEFT) {
            x -= 1;
        }
        inspect();
    }

    // Tourne le personnage de 90° vers la gauche
    void turnLeft() {
        direction -= 1;
        if (direction < DIRECTION_UP) {
            direction = DIRECTION_LEFT;
        }
        inspect();
    }

    // Tourne le personnage de 90° vers la droite
    void turnRight() {
        direction += 1;
        if (direction > DIRECTION_LEFT) {
            direction = DIRECTION_UP;
        }
        inspect();
    }

    boolean canAttack(Actor otherActor) {
        if (x == otherActor.x && y == otherActor.y + 1 && direction == DIRECTION_UP) {
            return true;
        } else if (x == otherActor.x - 1 && y == otherActor.y && direction == DIRECTION_RIGHT) {
            return true;
        } else if (x == otherActor.x && y == otherActor.y - 1 && direction == DIRECTION_DOWN) {
            return true;
        } else if (x == otherActor.x + 1 && y == otherActor.y && direction == DIRECTION_LEFT) {
            return true;
        } else {
            return false;
        }        
    }

    void attack(Actor otherActor) {
        if (canAttack(otherActor)) {
            otherActor.health -= 10;
            System.out.println(name + " attacks " + otherActor.name);
            System.out.println(otherActor.name + " has " + otherActor.health + " HP remaining");
        } else {
            System.out.println(name + " cannot attack " + otherActor.name);    
        }
    }

    void inspect() {
        System.out.println(name + " (" + health + " HP) is at (" + x + ", " + y + "), facing " + DIRECTION_NAMES[direction]);
    }
}