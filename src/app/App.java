package app;

import app.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player();

        System.out.println(player.lives);

        player.inspect();

        player.turnLeft();
        player.moveForward();
        player.turnLeft();
        player.moveForward();
        player.turnLeft();
        player.moveForward();
    }
}