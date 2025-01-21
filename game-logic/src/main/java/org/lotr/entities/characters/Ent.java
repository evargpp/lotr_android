package org.lotr.entities.characters;

public class Ent extends BeastCharacter {
    private int natureAffinity;

    public Ent(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, boolean isWild, int natureAffinity) {
        super(name, healthPoints, attackPower, strength, stamina, fear, isWild);
        this.natureAffinity = natureAffinity;
    }

    // Getter i Setter dla natureAffinity
    public int getNatureAffinity() {
        return natureAffinity;
    }

    public void setNatureAffinity(int natureAffinity) {
        this.natureAffinity = natureAffinity;
    }


    // Specjalna zdolność: Regeneracja
    public void regenerate() {
        if (natureAffinity > 60) {  // Zakładamy, że musi mieć pewien poziom związku z naturą
            int healthRegained = natureAffinity / 2;
            setHealthPoints(getHealthPoints() + healthRegained);
            System.out.println(getName() + " regenerates health by " + healthRegained + " points using the power of nature.");
        } else {
            System.out.println(getName() + " does not have enough nature affinity to regenerate effectively.");
        }
    }

    @Override
    public void attack() {

    }
}
