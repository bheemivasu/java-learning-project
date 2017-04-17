package com.learning.operators.arithmaticoperator;

/**
 * Created by bheemivasu on 17-04-2017.
 */
public class ArithmaticOperatorExample {

    public static void plusOperator(){
        int x=10;
        int y=10;
        int sum=x+y;
        System.out.println("sum of the numbers " +sum);
    }

    public static void incrementOperator(){
        int x=10;
        int y=++x;
        System.out.println("increment operator " +y);
    }
    public static void decrementOperator(){
        int x=10;
        int y=--x;
        System.out.println("decrement operator " +y);
    }

    public static void main(String[] args) {
        plusOperator();
        incrementOperator();
        decrementOperator();
    }
}
