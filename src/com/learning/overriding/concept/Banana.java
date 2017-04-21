package com.learning.overriding.concept;

public class Banana extends FruitesParentClass {

	public  void colour() {
	super.colour();
		System.out.println("Banana very colorful");
	}
	public void taste() {
		//super.taste();
		System.out.println("banana are taste");
	}

}
