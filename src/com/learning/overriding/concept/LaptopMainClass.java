package com.learning.overriding.concept;
/**
 * this main class for laptop childclass
 * we are create objects for the subclass
 * @author bheemivasu
 *
 */
public class LaptopMainClass {

	public static void main(String[] args) {
		LaptopChildClass lap = new LaptopChildClass();
		lap.size();
		lap.ram();
		lap.memory();
	}

}
