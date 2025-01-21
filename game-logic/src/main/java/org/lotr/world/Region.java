package org.lotr.world;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private List<City> cities;

    public Region(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public List<City> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        return "Region name: " + name + ", cities: \n" + cities;
    }
}
