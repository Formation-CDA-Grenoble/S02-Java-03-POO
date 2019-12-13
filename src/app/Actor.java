package app;

// Classe représentant un personnage du jeu
// Tout le code commun à toutes les classes représentant des perseonnages est
// concentré ici
class Actor {
    // Constantes définies par commodité, elles nour permettent d'utiliser des
    // noms au lieu d'utiliser directement des valeurs
    // - "static" indique que la propriété appartient à la classe, et qu'il ne
    // doit y en avoir qu'une seule copie pour toutes ses instances
    // - "final" indique qu'il est interdit de modifier la valeur de la
    // propriété
    static final int DIRECTION_UP = 0;
    static final int DIRECTION_RIGHT = 1;
    static final int DIRECTION_DOWN = 2;
    static final int DIRECTION_LEFT = 3;
    static final String[] DIRECTION_NAMES = new String[] {"up", "right", "down", "left"};

    // Nom du personnage
    String name;
    // Position du personnage
    int x;
    int y;
    // Santé du personnage
    int health;
    // Direction dans laquelle le personnage regarde
    // Sera égal à l'une des constantes définies ci-dessus
    int direction;

    // Constructeur
    // Force toute personne qui voudrait créer des objets à partir de notre
    // classe à leur donner au moins un nom et une position au moment de
    // leur création
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

    // Détermine si le peresonnage est capable d'attaquer un autre personnage
    // ou non
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

    // Attaque un autre personnage
    void attack(Actor otherActor) {
        // Si le personnage a le droit d'attaquer sa cible
        if (canAttack(otherActor)) {
            // Enlève des points de vie à sa cible
            otherActor.health -= 10;
            // Affiche un retour utilisateur dans la console
            System.out.println(name + " attacks " + otherActor.name);
            System.out.println(otherActor.name + " has " + otherActor.health + " HP remaining");
            // Si les points de vie de la cible sont tombés à zéro
            if (otherActor.health <= 0) {
                // Demande à la cible de faire ce qui est prévu lorsque ses
                // points de vie tombent à zéro
                otherActor.die();
            }
        } else {
            // Affiche un retour utilisateur dans la console
            System.out.println(name + " cannot attack " + otherActor.name);    
        }
    }

    // Actions spécifiques à exécuter quand le personnage a perdu tous ses
    // points de vie
    void die() {
        System.out.println(name + " is dead");
    }

    // Affiche un retour utilisateur dans la console pour visualiser les
    // propriétés actuelles du personnage
    void inspect() {
        System.out.println(name + " (" + health + " HP) is at (" + x + ", " + y + "), facing " + DIRECTION_NAMES[direction]);
    }
}