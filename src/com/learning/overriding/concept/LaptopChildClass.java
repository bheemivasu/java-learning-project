package com.learning.overriding.concept;
/**
 * this class inheretance from super class
 * in this class have same method but some functions are different
 * this class execute with main class
 * @author bheemivasu
 *
 */
public class LaptopChildClass extends LaptopParentClass {
	public void size() {
		System.out.println("laptop size is 14inch and 15.6inch");
	}

	public void ram() {
		super.ram();
		System.out.println("Ram  is 12GB");
	}

	public void memory() {
		System.out.println("laptop memory is 1TB");
	}

}
