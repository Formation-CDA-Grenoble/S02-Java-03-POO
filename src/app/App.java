package app;

import app.Player;
import app.Enemy;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player("Jean-Pierre", 2, 2);

        Enemy enemy1 = new Enemy("Alfred", 1, 2);

        player.inspect();
        enemy1.inspect();
        
        // player.turnLeft();
        // player.attack(enemy1);
        // player.attack(enemy1);

        enemy1.turnRight();
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