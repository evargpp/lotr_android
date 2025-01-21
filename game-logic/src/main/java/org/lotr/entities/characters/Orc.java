package org.lotr.entities.characters;

public class Orc extends BeastCharacter {
    private int rageLevel;

    public Orc(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, boolean isWild, int rageLevel) {
        super(name, healthPoints, attackPower, strength, stamina, fear, isWild);
        this.rageLevel = rageLevel;
    }

    // Getter i Setter dla rageLevel
    public int getRageLevel() {
        return rageLevel;
    }

    public void setRageLevel(int rageLevel) {
        this.rageLevel = rageLevel;
    }


    // Specjalna zdolność: Wzmożony atak
    public void unleashRage(AbstractCharacter enemy) {
        // wcieklosc moze zwiekszac sile ataku i zwikeszac strach przeciwnikow
    }

    @Override
    public void attack() {

    }
}
