package app;

import app.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player();

        player.inspect();

        player.turnLeft();
        player.moveForward();
        player.turnLeft();
        player.moveForward();
        player.turnLeft();
        player.moveForward();
    }
}