package app;

import app.Player;
import app.Enemy;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player(5, 3);

        Enemy enemy1 = new Enemy(8, 2);

        player.inspect();

        player.turnLeft();
        player.moveForward();
        player.turnLeft();
        player.moveForward();
        player.turnLeft();
        player.moveForward();
    }
}