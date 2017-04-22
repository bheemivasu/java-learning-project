package com.learning.abstractclass.latestexamples;

/**
 * Created by bheemivasu on 22-04-2017.
 */
public abstract class Fruit {

    public String getMyFruitColor() {
        String color = "Red";
        return color;
    }

    public String getMyfruitTast() {
        String taste = "SWEET";
        return taste;
    }

    public abstract void fruitName();
}