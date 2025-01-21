package org.lotr.entities.characters;

public abstract class HumanoidCharacter extends AbstractCharacter {
    private int agility;
    private int intelligence;

    public HumanoidCharacter(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, int agility, int intelligence) {
        super(name, healthPoints, attackPower, strength, stamina, fear);
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public abstract void attack();

}
