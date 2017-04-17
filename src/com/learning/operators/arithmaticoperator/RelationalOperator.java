package com.learning.operators.arithmaticoperator;

/**
 * Created by bheemivasu on 17-04-2017.
 */
public class RelationalOperator {

    public void equalRelationalOperator() {

        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("Both x and y are equal");
        } else {
            System.out.println("not equal");
        }

    }

    public static void main(String[] args) {
        RelationalOperator relationalOperator = new RelationalOperator();
        relationalOperator.equalRelationalOperator();
    }
}

