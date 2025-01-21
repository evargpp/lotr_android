package org.lotr.entities.characters;

public class Hobbit extends HumanoidCharacter {
    private int stealthSkill;

    public Hobbit(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, int agility, int intelligence, int stealthSkill) {
        super(name, healthPoints, attackPower, strength, stamina, fear, agility, intelligence);
        this.stealthSkill = stealthSkill;
    }

    // Getter i Setter dla stealthSkill
    public int getStealthSkill() {
        return stealthSkill;
    }

    public void setStealthSkill(int stealthSkill) {
        this.stealthSkill = stealthSkill;
    }


    // Specjalna zdolność: Ukrywanie się przed wrogami
    public void hideFromEnemy(AbstractCharacter enemy) {
        //bedzie sie ukrywał co przblokuje mozliwosc zadawani obrazen i zregeneruje zycie np o 20 procent

    }

    @Override
    public void attack() {

    }
}
