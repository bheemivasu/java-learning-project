package com.learning.abstractclass.latestexamples;

/**
 * Created by bheemivasu on 22-04-2017.
 */
public class FruitAbstractionTest {
    private static FruitAbstration fb = new FruitAbstration();

    public static void main(String[] args) {
        fb.fruitName();
        String fruitColor = fb.getMyFruitColor();
        System.out.println("Fruits color" + fruitColor.toUpperCase());
        // fb.getMyfruitTast();
        System.out.println(fb.getMyfruitTast());
    }
}
