package org.lotr.world;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Bakery extends AbstractBuilding{

    private int accumulatedBread = 0;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public Bakery(String name) {
        super(name);
        startBreadProduction();
    }

    private void startBreadProduction() {
        scheduler.scheduleWithFixedDelay(() -> {
            accumulatedBread += 20;
        }, 0, 3, TimeUnit.SECONDS);
    }

    public int collectBread() {
        int collected = accumulatedBread;
        accumulatedBread = 0;
        return collected;
    }

    @Override
    public void performAction() {
        System.out.println("Pieczemy ciasteeeeczka!!!");
    }
}
