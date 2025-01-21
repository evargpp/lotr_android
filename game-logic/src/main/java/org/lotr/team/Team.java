package org.lotr.team;

import org.lotr.entities.characters.AbstractCharacter;
import org.lotr.entities.goods.GoodsType;
import org.lotr.world.City;

import java.util.ArrayList;
import java.util.List;

public class Team {
    // Singleton instance
    private static Team instance;

    // Atrybuty drużyny
    private String name;
    private List<AbstractCharacter> members;
    private int fish;
    private int bread;
    private int mithril;
    private City currentCity;
    private boolean inTransit;



    // Prywatny konstruktor
    private Team(String name, City startingCity) {
        this.name = name;
        this.members = new ArrayList<>();
        this.fish = 0;
        this.bread = 0;
        this.mithril = 0;
        this.currentCity = startingCity;
        this.inTransit = false;

    }

    // Publiczna metoda do uzyskania instancji drużyny (Singleton)
    public static Team getInstance(String name, City startingCity) {
        if (instance == null) {
            instance = new Team(name, startingCity);
        }
        return instance;
    }

    // Metoda dodająca członka do drużyny
    public void addMember(AbstractCharacter character) {
        members.add(character);
        System.out.println(character.getName() + " dołączył do drużyny.");
    }

    // Dodawanie zasobów do drużyny przy użyciu enum ResourceType
    public void addResources(GoodsType resourceType, int amount) {
        switch (resourceType) {
            case FISH:
                fish += amount;
                break;
            case BREAD:
                bread += amount;
                break;
            case MITHRIL:
                mithril += amount;
                break;
            default:
                System.out.println("Nieznany typ zasobu: " + resourceType);
        }
    }

    // Wyświetlanie stanu drużyny
    public void showTeamStatus() {
        System.out.println("Drużyna " + name + " jest w mieście: " + currentCity.getName());
        System.out.println("Zasoby - Rybki: " + fish + ", Chlebki: " + bread + ", Mithril: " + mithril);
        System.out.println("Członkowie drużyny: ");
        for (AbstractCharacter member : members) {
            System.out.println(" - " + member.getName());
        }
    }

    // Zmiana lokalizacji drużyny
    public void moveToCity(City newCity) {
        System.out.println("Drużyna " + name + " podróżuje z " + currentCity.getName() + " do " + newCity.getName());
        this.currentCity = newCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInTransit() {
        return inTransit;
    }

    public void setInTransit(boolean inTransit) {
        this.inTransit = inTransit;
    }

    // Gettery dla zasobów i lokalizacji
    public int getFish() {
        return fish;
    }

    public int getBread() {
        return bread;
    }

    public int getMithril() {
        return mithril;
    }

    public City getCurrentCity() {
        if (inTransit) {
            System.out.println("Drużyna jest w trakcie podróży, nie znajduje się w żadnym mieście.");
            return null;  // lub można zwrócić ostatnie znane miasto, zależnie od założeń gry
        }
        return currentCity;
    }

    public List<AbstractCharacter> getMembers() {
        return members;
    }
}


