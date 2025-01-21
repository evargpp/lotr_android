package org.lotr.world;

public class Bakery extends AbstractBuilding{

    public Bakery(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println("Pieczemy ciasteeeeczka!!!");
        // Logika produkcji sucharków
    }
}
