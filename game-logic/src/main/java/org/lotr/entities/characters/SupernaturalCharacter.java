package org.lotr.entities.characters;

public class SupernaturalCharacter extends AbstractCharacter{

    private int supernaturalPower;

    public SupernaturalCharacter(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, int supernaturalPower) {
        super(name, healthPoints, attackPower, strength, stamina, fear);
        this.supernaturalPower = supernaturalPower;
    }

    public int getSupernaturalPower() {
        return supernaturalPower;
    }

    public void setSupernaturalPower(int supernaturalPower) {
        this.supernaturalPower = supernaturalPower;
    }

    @Override
    public void attack() {

    }
}
