package org.lotr.world;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Mine extends AbstractBuilding {

    private int accumulatedOre = 0;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public Mine(String name) {
        super(name);
        startOreProduction();
    }

    private void startOreProduction() {
        scheduler.scheduleWithFixedDelay(() -> {
            accumulatedOre += 10;
        }, 0, 7, TimeUnit.SECONDS);
    }

    public int collectOre() {
        int collected = accumulatedOre;
        accumulatedOre = 0;
        return collected;
    }

    @Override
    public void performAction() {
        System.out.println("Kopiemy rudę mithrilu!");
    }
}
