package com.learning.interfaceconcept;

/**
 * Created by bheemivasu on 22-04-2017.
 */
public class   MobileImplements implements Mobiles {
    @Override
    public void mobileCost() {
        long cost=45000;
        System.out.println("MobileCost =="+cost);

    }

    @Override
    public void mobileName() {
        String MobileName="APPLE";
        System.out.println("MobileName=="+MobileName);

    }

    @Override
    public void mobileRAM() {
        String ram="2GB";
        System.out.println("MobileRAM=="+ram);

    }

    public static void main(String[] args) {
        MobileImplements mi =new MobileImplements();
        mi.mobileName();
        mi.mobileCost();
        mi.mobileRAM();
    }
}
