package org.lotr.main;

import org.lotr.controllers.GameController;
import org.lotr.world.Bakery;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        gameController.newGame();


        int bread = gameController.getTeam().getBread();

        int breadnow = gameController.getTeam().getCurrentCity().findBuildingByType(Bakery.class).collectBread();

        System.out.println(bread);

        Timer timer = new Timer();
        System.out.println("Zadanie zostanie wykonane za 15 sekund...");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Bakery bakery = gameController.getTeam().getCurrentCity().findBuildingByType(Bakery.class);
                if (bakery != null) {
                    int breadnow = bakery.collectBread();
                    gameController.getTeam().addBread(breadnow);

                    System.out.println("Minęło 15 sekund, dodano: " + breadnow + " chleba.");
                    System.out.println("Aktualna ilość chleba: " + gameController.getTeam().getBread());
                } else {
                    System.out.println("Błąd: Piekarnia nie znaleziona.");
                }
            }
        }, 15000);





        System.out.println(gameController.getWorld());
        System.out.println("Team name: " + gameController.getTeam().getName());
    }
}
