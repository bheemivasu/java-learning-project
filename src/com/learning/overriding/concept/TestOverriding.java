package com.learning.overriding.concept;

public class TestOverriding {

	/**
	 * Overriding means subclass implements the parents method based on requirments 
	 *Rules:
	 *1)Same method name in subclass and super class 
	 *2)The method args are same in both class
	 *3)Modifiers are also same in both the class
	 */
	public static void main(String[] args) {
		BmwCar bc = new BmwCar();
		bc.light();
		bc.sound();
		bc.move();

	}

}
