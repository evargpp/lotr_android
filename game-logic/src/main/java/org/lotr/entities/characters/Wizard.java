package org.lotr.entities.characters;

public class Wizard extends MagicalCharacter{



    public Wizard(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, int agility, int intelligence, int magicPower) {
        super(name, healthPoints, attackPower, strength, stamina, fear, agility, intelligence, magicPower);
    }

    @Override
    public void attack() {

    }

    public void healing() {
        //leczenie innych,
    }

    public void protectionAura() {
        //ochrona przed atakiem,
    }
}
