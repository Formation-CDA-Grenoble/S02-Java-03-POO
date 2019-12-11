package app;

import app.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Player player = new Player();

        player.turnLeft();

        System.out.println(player.direction);
    }
}