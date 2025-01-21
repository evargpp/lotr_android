package org.lotr.initializers;

import org.lotr.team.Team;
import org.lotr.Trip.Trip;
import org.lotr.entities.characters.Elf;
import org.lotr.entities.characters.Hobbit;
import org.lotr.world.*;

public class GameInitializer {

    public static BasicWorld initializeWorld() {
        BasicWorld middleEarth = BasicWorld.getInstance();

        // Tworzenie regionów
        Region shire = new Region("Shire");
        Region lonelyMountain = new Region("LonelyMountain");

        middleEarth.addRegion(shire);
        middleEarth.addRegion(lonelyMountain);

        // Tworzenie miast
        City hobbiton = new City("Hobbiton", shire, -4, 5);
        City erebor = new City("Erebor", lonelyMountain, 2, 2);

        shire.addCity(hobbiton);
        lonelyMountain.addCity(erebor);

        // Dodanie budynków
        hobbiton.addBuilding(new FishingHut("GounlyFishingHut"));
        hobbiton.addBuilding(new Bakery("BallyBakery"));
        hobbiton.addBuilding(new Tavern("TurryTavern"));

        erebor.addBuilding(new Tavern("GrimmlyTavern"));
        erebor.addBuilding(new Mine("MithrilMine"));

        return middleEarth;
    }

    public static Team initializeTeam(City startingCity) {
        Team team = Team.getInstance("Drużyna Pierścienia", startingCity);

        Hobbit hobbit = new Hobbit("Frodo", 50, 20, 10, 15, 5, 10, 20, 20);
        Elf elf = new Elf("Legolas", 50, 20, 10, 15, 5, 10, 20);

        team.addMember(hobbit);
        team.addMember(elf);

        return team;
    }
}
