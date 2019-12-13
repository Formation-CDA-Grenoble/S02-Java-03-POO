package app;

import app.Player;
import app.Enemy;

public class App {
    public static void main(String[] args) throws Exception {
        // Crée un nouveau joueur à la position 2, 2
        Player player = new Player("Jean-Pierre", 2, 2);

        // Crée un nouveau monstre à la position 1, 2
        Enemy enemy1 = new Enemy("Alfred", 1, 2);

        // Affiche l'état de départ du joueur et du monstre
        player.inspect();
        enemy1.inspect();
        
        // Demande au joueur de pivoter vers la gauche pour se retrouver
        // face au monstre
        player.turnLeft();
        // Demande au joueur d'attaquer 2 fois le monstre pour le tuer
        player.attack(enemy1);
        player.attack(enemy1);

        // Crée un nouveau monstre à la position 1, 2
        enemy1 = new Enemy("Alfred", 1, 2);

        // Demande au monstre de pivoter vers la droite pour se retrouver
        // face au joueur
        enemy1.turnRight();
        // Demande au joueur d'attaquer 10 fois le joueur pour le tuer
        enemy1.attack(player);
        enemy1.attack(player);
        enemy1.attack(player);
        enemy1.attack(player);
        enemy1.attack(player);
        enemy1.attack(player);
        enemy1.attack(player);
        enemy1.attack(player);
        enemy1.attack(player);
        enemy1.attack(player);
    }
}