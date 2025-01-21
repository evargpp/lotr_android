package org.lotr.entities.characters;

import java.util.UUID;

public abstract class AbstractCharacter {
    private final String id;
    private String name;
    private int healthPoints;
    private int attackPower;
    private int strength;
    private int stamina;
    private int fear;

    public AbstractCharacter(String name, int healthPoints, int attackPower, int strength, int stamina, int fear) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.healthPoints = healthPoints;
        this.attackPower = attackPower;
        this.strength = strength;
        this.stamina = stamina;
        this.fear = fear;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getFear() {
        return fear;
    }

    public void setFear(int fear) {
        this.fear = fear;
    }

    public abstract void attack();


}
