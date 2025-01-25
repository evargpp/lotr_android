package org.lotr.world;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Sawmill extends AbstractBuilding {

    private int accumulatedWood = 0;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public Sawmill(String name) {
        super(name);
        startWoodProduction();
    }

    private void startWoodProduction() {
        scheduler.scheduleWithFixedDelay(() -> {
            accumulatedWood += 25;
        }, 0, 4, TimeUnit.SECONDS);
    }

    public int collectWood() {
        int collected = accumulatedWood;
        accumulatedWood = 0;
        return collected;
    }

    @Override
    public void performAction() {
        System.out.println("Przetwarzamy drewno!");
    }
}
