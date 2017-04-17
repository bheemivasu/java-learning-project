package com.learning.overriding.concept;

/**
 * 
 * @author bheemivasu
 * this is BMW subclass extends parent class,
 * extends means Inheritance (subclass inhert parent class methods)
 *
 */
public class BmwCar extends CarParent {

	public void move() {
		System.out.println("car can move fastly");
	}
	public void light(){
		System.out.println("Bright lighting");
	}
}
