package org.lotr.world;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class FishingHut extends AbstractBuilding {

    private int accumulatedFish = 0;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public FishingHut(String name) {
        super(name);
        startFishProduction();
    }

    private void startFishProduction() {
        scheduler.scheduleWithFixedDelay(() -> {
            accumulatedFish += 15;  // Przykładowa ilość produkcji ryb
        }, 0, 5, TimeUnit.SECONDS);
    }

    public int collectFish() {
        int collected = accumulatedFish;
        accumulatedFish = 0;
        return collected;
    }

    @Override
    public void performAction() {
        System.out.println("Łowimy rybki...");
    }
}
