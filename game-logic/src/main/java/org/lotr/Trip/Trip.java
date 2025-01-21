package org.lotr.Trip;

import org.lotr.team.Team;
import org.lotr.world.City;

public class Trip implements Runnable {
    private Team team;
    private City destinationCity;
    private long travelTimeInSeconds;

    public Trip(Team team, City destinationCity) {
        this.team = team;
        this.destinationCity = destinationCity;
        DistanceCalculator calculator = new DistanceCalculator();
        this.travelTimeInSeconds = calculator.calculateTravelTime(team.getCurrentCity(), destinationCity);
    }

    @Override
    public void run() {
        try {
            System.out.println("Drużyna " + team.getName() + " wyrusza w podróż do " + destinationCity.getName() + ".");
            team.setInTransit(true);

            // Symulacja podróży poprzez "sleep"
            Thread.sleep(travelTimeInSeconds * 1000);

            // Zakończenie podróży
            team.setInTransit(false);
            team.moveToCity(destinationCity);
            System.out.println("Drużyna " + team.getName() + " dotarła do " + destinationCity.getName() + ".");
            System.out.println("Obecna lokalizacja drużyny: " + team.getCurrentCity().getName());
        } catch (InterruptedException e) {
            System.err.println("Podróż została przerwana.");

            // bedzie tutaj mozna dodac obserwatora aby przekazywał info do jakiegos terminalu
        }
    }
}