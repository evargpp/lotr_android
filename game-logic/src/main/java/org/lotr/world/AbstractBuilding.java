package org.lotr.world;

public abstract class AbstractBuilding {
    protected String name;
    protected int level;

    public AbstractBuilding(String name) {
        this.name = name;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void upgrade() {
        level++;
        System.out.println(name + " poziom został UP" + level);
    }

    public abstract void performAction();

    @Override
    public String toString() {
        return "\nname: " + name + ", level " + level;
    }
}
