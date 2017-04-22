package com.learning.abstractclass.example;

/**
 * Created by bheemivasu on 22-04-2017.
 */
public class BankChilidClass extends BankParentClass {
    public void bankData() {
        String name = "vasu";
        long acNo = 12341234;
        double acpoints = 98.6;
        long balance = 5000;
        System.out.println("Name=" + name);
        System.out.println("acNo=" + acNo);
        System.out.println("acpoints=" + acpoints);
        System.out.println("Balance=" + balance);
    }


    public void bankName() {
        String bankname = "ICICI";
        System.out.println("Bank name==" + bankname);

    }

    public static void main(String[] args) {
        BankParentClass bp = new BankChilidClass();
        bp.bankName();
        bp.bankData();


    }
}
