package org.lotr.entities.characters;

public abstract class MagicalCharacter extends HumanoidCharacter {

    private int magicPower;

    public MagicalCharacter(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, int agility, int intelligence, int magicPower) {
        super(name, healthPoints, attackPower, strength, stamina, fear, agility, intelligence);
        this.magicPower = magicPower;
    }

    // Getter i Setter dla magicPower
    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }


    // Specjalna zdolność: Przemiana bestii
    public void tameBeast(BeastCharacter beast) {
        if (magicPower > 50) {  // Zakładamy, że musi mieć pewien poziom magicznej mocy
            beast.setWild(false);
            System.out.println(getName() + " has tamed the beast " + beast.getName() + ".");
        } else {
            System.out.println(getName() + " does not have enough magic power to tame the beast.");
        }
    }

    public void protect() {
        //bedzie miał mozliwosc zablokowania otrzymywania obrazen dla danych jednostek
    }
}
