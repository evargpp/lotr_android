package org.lotr.world;

import java.util.ArrayList;
import java.util.List;

public class BasicWorld {
    private static BasicWorld instance;  // Singleton

    private List<Region> regions;

    private BasicWorld() {
        this.regions = new ArrayList<>();
    }

    // Singleton- zapewnia, że jest tylko jeden świat, przenalizuj sobie
    public static BasicWorld getInstance() {
        if (instance == null) {
            instance = new BasicWorld();
        }
        return instance;
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public List<Region> getRegions() {
        return regions;
    }


    @Override
    public String toString() {
        return "BasicWorld \n" + "regions: " + regions;
    }
}
