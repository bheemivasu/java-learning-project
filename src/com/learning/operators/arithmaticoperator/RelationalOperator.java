package com.learning.operators.arithmaticoperator;

/**
 * Created by bheemivasu on 17-04-2017.
 */
public class RelationalOperator {

    public static void equalRelationalOperator() {

        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("Both x and y are equal");
        } else {
            System.out.println("not equal");
        }
    }

    public static void notEqualRelationalOperator() {

        int x = 50;
        int y = 60;
        if (x != y) {
            System.out.println("!=operator Both x and y are notequal");
        } else {
            System.out.println("!=operator  equal");
        }

    }

    public static void lessThen() {
        int x = 50;
        int y = 60;
        if (x < y) {
            System.out.println("< operator y big");
        } else {
            System.out.println("< operator x big");
        }

    }

    public static void greterThen() {
        int x = 50;
        int y = 60;
        if (x > y) {
            System.out.println("> operator x big");
        } else {
            System.out.println("> operator y big");
        }

    }

    public static void lessThenEqual() {
        int x = 50;
        int y = 50;
        if (x <= y) {
            System.out.println("<= operator y big or equal");
        } else {
            System.out.println("<= operator x big or equal");
        }

    }

    public static void greterThenEqual() {
        int x = 50;
        int y = 60;
        if (x >= y) {
            System.out.println(">= operator x big or equal");
        } else {
            System.out.println(">= operator y big or equal");
        }

    }

    public static void main(String[] args) {
        equalRelationalOperator();
        notEqualRelationalOperator();
        lessThen();
        greterThen();
        lessThenEqual();
        greterThenEqual();
    }
}

