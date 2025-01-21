package org.lotr.entities.characters;

public abstract class BeastCharacter extends AbstractCharacter {
    private boolean isWild;

    public BeastCharacter(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, boolean isWild) {
        super(name, healthPoints, attackPower, strength, stamina, fear);
        this.isWild = isWild;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean isWild) {
        this.isWild = isWild;
    }

    @Override
    public abstract void attack();
}
