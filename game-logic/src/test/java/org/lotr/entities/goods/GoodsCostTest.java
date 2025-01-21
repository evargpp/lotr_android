package org.lotr.entities.goods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsCostTest {

    @Test
    void setValueByConstructorGetByGetValue() {
        int valueMithril = 111;
        int valueWood = 222;
        int valueFish = 333;

        GoodsCost goodsCost = new GoodsCost(valueMithril, valueWood, valueFish);
        assertEquals(valueMithril, goodsCost.getValue(GoodsType.MITHRIL), "Nieprawidłowa wartość dla Mithtiilu");
        assertEquals(valueWood, goodsCost.getValue(GoodsType.WOOD), "Nieprawidłowa wartość dla Drewna");
        assertEquals(valueFish, goodsCost.getValue(GoodsType.FISH), "Nieprawidłowa wartość dla Ryb");
    }

    @Test
    void setValueByConstructorGetByGetMethods() {
        int valueMithril = 111;
        int valueWood = 222;
        int valueFish = 333;

        GoodsCost goodsCost = new GoodsCost(valueMithril, valueWood, valueFish);
        assertEquals(valueMithril, goodsCost.getMithril(), "Nieprawidłowa wartość dla Mithtiilu");
        assertEquals(valueWood, goodsCost.getWood(), "Nieprawidłowa wartość dla Drewna");
        assertEquals(valueFish, goodsCost.getFish(), "Nieprawidłowa wartość dla Ryb");
    }


    @Test
    void emptyConstructorAndGetByValueMethod() {
        int valueMithril = 111;
        int valueWood = 222;
        int valueFish = 333;

        GoodsCost goodsCost = new GoodsCost();
        goodsCost.setValue(GoodsType.MITHRIL, valueMithril);
        goodsCost.setValue(GoodsType.WOOD, valueWood);
        goodsCost.setValue(GoodsType.FISH, valueFish);

        assertEquals(valueMithril, goodsCost.getMithril(), "Nieprawidłowa wartość dla Mithtiilu");
        assertEquals(valueWood, goodsCost.getWood(), "Nieprawidłowa wartość dla Drewna");
        assertEquals(valueFish, goodsCost.getFish(), "Nieprawidłowa wartość dla Ryb");
    }

    @Test
    void emptyConstructorAndSetByValueMethodAndGetByMethods() {
        int valueMithril = 111;
        int valueWood = 222;
        int valueFish = 333;

        GoodsCost goodsCost = new GoodsCost();
        goodsCost.setMithril(valueMithril);
        goodsCost.setWood(valueWood);
        goodsCost.setFish(valueFish);

        assertEquals(valueMithril, goodsCost.getMithril(), "Nieprawidłowa wartość dla Mithtiilu");
        assertEquals(valueWood, goodsCost.getWood(), "Nieprawidłowa wartość dla Drewna");
        assertEquals(valueFish, goodsCost.getFish(), "Nieprawidłowa wartość dla Ryb");
    }

    @Test
    void add() {
        int valueMithril1 = 111;
        int valueMithril2 = 444;
        int valueWood1 = 222;
        int valueWood2 = 555;
        int valueFish1 = 333;
        int valueFish2 = 666;

        GoodsCost gc1 = new GoodsCost(valueMithril1, valueWood1, valueFish1);
        GoodsCost gc2 = new GoodsCost(valueMithril2, valueWood2, valueFish2);

        gc1.add(gc2);

        assertEquals(
                valueMithril1 + valueMithril2,
                gc1.getMithril(),
                "Nieprawidłowa wartość dla Mithtiilu");

        assertEquals(
                valueWood1+valueWood2,
                gc1.getWood(),
                "Nieprawidłowa wartość dla Drewna");

        assertEquals(
                valueFish1+valueFish2,
                gc1.getFish(),
                "Nieprawidłowa wartość dla Ryb");
    }

    @Test
    void addMithrilWoodFish() {
        int valueMithril1 = 111;
        int valueMithril2 = 444;
        int valueWood1 = 222;
        int valueWood2 = 555;
        int valueFish1 = 333;
        int valueFish2 = 666;

        GoodsCost gc1 = new GoodsCost(valueMithril1, valueWood1, valueFish1);

        gc1.add(valueMithril2, valueWood2, valueFish2);

        assertEquals(
                valueMithril1 + valueMithril2,
                gc1.getMithril(),
                "Nieprawidłowa wartość dla Mithtiilu");

        assertEquals(
                valueWood1+valueWood2,
                gc1.getWood(),
                "Nieprawidłowa wartość dla Drewna");

        assertEquals(
                valueFish1+valueFish2,
                gc1.getFish(),
                "Nieprawidłowa wartość dla Ryb");
    }

    @Test
    void mul() {
        int valueMithril = 112;
        int valueWood = 223;
        int valueFish = 334;
        int times = 5;

        GoodsCost gc1 = new GoodsCost(valueMithril, valueWood, valueFish);
        gc1.mul(times);

        assertEquals(
                valueMithril * times,
                gc1.getMithril(),
                "Nieprawidłowa wartość dla Mithtiilu");

        assertEquals(
                valueWood * times,
                gc1.getWood(),
                "Nieprawidłowa wartość dla Drewna");

        assertEquals(
                valueFish * times,
                gc1.getFish(),
                "Nieprawidłowa wartość dla Ryb");
    }

    @Test
    void mulAndAdd() {
        int valueMithril1 = 111;
        int valueMithril2 = 444;
        int valueWood1 = 222;
        int valueWood2 = 555;
        int valueFish1 = 333;
        int valueFish2 = 666;
        int times = 5;

        GoodsCost gc1 = new GoodsCost(valueMithril1, valueWood1, valueFish1);
        GoodsCost gc2 = new GoodsCost(valueMithril2, valueWood2, valueFish2);

        gc1.mulAndAdd(gc2, times);

        assertEquals(
                valueMithril1 + (valueMithril2 * times),
                gc1.getMithril(),
                "Nieprawidłowa wartość dla Mithtiilu");

        assertEquals(
                valueWood1 + (valueWood2 * times),
                gc1.getWood(),
                "Nieprawidłowa wartość dla Drewna");

        assertEquals(
                valueFish1 + (valueFish2 * times),
                gc1.getFish(),
                "Nieprawidłowa wartość dla Ryb");
    }


}