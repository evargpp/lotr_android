package org.lotr.world;

import org.lotr.world.AbstractBuilding;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private int x;
    private int y;
    private List<AbstractBuilding> buildings;
    private Region region;  // Relacja z regionem, do którego należy miasto

    public City(String name, Region region, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.region = region;
        this.buildings = new ArrayList<>();
        System.out.println(name + " belongs to region: " + region.getName());
    }

    public String getName() {
        return name;
    }

    // signleton aby istaniłtylko jeden budynek w danym mieście!
    public void addBuilding(AbstractBuilding building) {
        for (AbstractBuilding existingBuilding : buildings) {
            if (existingBuilding.getClass().equals(building.getClass())) {
                System.out.println("Ten budynek już istnieje" + building.getClass().getSimpleName() + " in " + name);
                return;
            }
        }
        buildings.add(building);
    }

    public List<AbstractBuilding> getBuildings() {
        return buildings;
    }

    public Region getRegion() {
        return region;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "City name='" + name + ", buildings: " + buildings +"\n";
    }
}
