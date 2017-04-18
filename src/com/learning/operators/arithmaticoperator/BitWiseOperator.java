package com.learning.operators.arithmaticoperator;

/**
 * Created by bheemivasu on 18-04-2017.
 */
public class BitWiseOperator {
    public static void BitWiseAnd(){
     int a=10;
     int b=15;
        System.out.println(a & b);
    }
    public static void BitWiseOr(){
        int a=10;
        int b=15;
        System.out.println(a | b);
    }

    public static void main(String[] args) {
        BitWiseAnd();
        BitWiseOr();
    }
}
