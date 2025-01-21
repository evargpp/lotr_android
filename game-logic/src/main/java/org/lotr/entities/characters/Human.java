package org.lotr.entities.characters;

public class Human extends HumanoidCharacter{

    public Human(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, int agility, int intelligence) {
        super(name, healthPoints, attackPower, strength, stamina, fear, agility, intelligence);
    }

    @Override
    public void attack() {

    }


}
