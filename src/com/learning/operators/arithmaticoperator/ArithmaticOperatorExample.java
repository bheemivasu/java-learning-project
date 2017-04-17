package com.learning.operators.arithmaticoperator;

/**
 * Created by bheemivasu on 17-04-2017.
 */
public class ArithmaticOperatorExample {

    public static void plusOperator() {
        int x = 10;
        int y = 10;
        int sum = x + y;
        System.out.println("sum of the numbers " + sum);
    }

    public static void subOperator() {
        int x = 20;
        int y = 10;
        int sub = x - y;
        System.out.println("sub of the numbers " + sub);
    }


    public static void incrementOperator() {
        int x = 10;
        int y = ++x;
        System.out.println("increment operator " + y);
    }

    public static void decrementOperator() {
        int x = 10;
        int y = --x;
        System.out.println("decrement operator " + y);
    }

    public static void divOperator() {
        int x = 10;
        int y = 10;
        int div = x / y;
        System.out.println("div of the numbers " + div);
    }

    public static void multiOperator() {
        int x = 10;
        int y = 10;
        int multi = x * y;
        System.out.println("multi of the numbers " + multi);
    }

    public static void moduOperator() {
        int x = 10;
        int y = 10;
        int modu = x % y;
        System.out.println("modu of the numbers " + modu);
    }


    public static void main(String[] args) {
        plusOperator();
        moduOperator();
        incrementOperator();
        decrementOperator();
        subOperator();
        multiOperator();
        divOperator();
    }
}
