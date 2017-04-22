package com.learning.constructors;

/**
 * Created by bheemivasu on 22-04-2017.
 */
public class Car {
    String carname;

    //Default constructor with out any arguments
    public Car() {
    }
    //parametrize constructor with arguments
    public Car(String carname) {
        this.carname = carname;
    }

    public void getMyCarName() {
        System.out.println(carname);
    }
}
