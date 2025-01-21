package org.lotr.entities.characters;

public class Balrog extends SupernaturalCharacter {
    // statyczne pole do przechowywania jedynej instancji klasy Balrog
    private static Balrog instance;

    public Balrog(String name, int healthPoints, int attackPower, int strength, int stamina, int fear, int supernaturalPower) {
        super(name, healthPoints, attackPower, strength, stamina, fear, supernaturalPower);
    }

    // singleton do zapewnienia że zostanie utworzony tylko jeden Balrog
    public static Balrog getInstance() {
        if (instance == null) {
            instance = new Balrog("Balrog", 1000, 200, 150, 100, 0, 100);
        }
        return instance;
    }

    @Override
    public void attack() {

    }
}

