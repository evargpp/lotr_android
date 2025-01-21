package org.lotr.Trip;

import org.lotr.world.City;

public class DistanceCalculator {

    public static long calculateTravelTime(City currentCity, City destinationCity) {
        int x1 = currentCity.getX();
        int y1 = currentCity.getY();
        int x2 = destinationCity.getX();
        int y2 = destinationCity.getY();

        // Obliczamy odległość euklidesową
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        long travelTimeInSeconds = (long) (distance * 5); // 5 sekund na jednostkę odległości
        return travelTimeInSeconds;
        //kwestai to usprawenienia albo wywalenia,
        // wpadłem na pomysł wstępny obliczania odległosci poprzez nadanie im koordynatów, po prostu mapa na osi XY i róznice miedzy punktami
    }
}
