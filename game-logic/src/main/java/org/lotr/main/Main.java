package org.lotr.main;

import org.lotr.controllers.GameController;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        gameController.newGame();

        System.out.println(gameController.getWorld());
        System.out.println("Team name: " + gameController.getTeam().getName());
    }
}
