package com.learning.inheritance.concept;

/**
 * Created by bheemivasu on 20-04-2017.
 */
public class Dogsubclass extends Animalsclass {
    public  void animalSound(){
        super.animals();
        super.animalsTypes();
        System.out.println("Dog sound");
    }
    public void dogColor(){

              System.out.println("Dog color is black");
    }

    public static void main(String[] args) {
        Dogsubclass dog =new Dogsubclass();
        dog.animalSound();
        dog.dogColor();
       // dog.animals();
        //dog.animalsTypes();
    }
}
