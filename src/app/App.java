package app;

import app.Player;
import app.Enemy;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player("Jean-Pierre", 5, 3);

        Enemy enemy1 = new Enemy("Alfred", 8, 2);

        player.inspect();
        enemy1.inspect();

        player.turnLeft();
        player.moveForward();

        enemy1.turnRight();
        enemy1.moveForward();

        player.turnLeft();
        player.moveForward();
        player.turnLeft();
        player.moveForward();
    }
}