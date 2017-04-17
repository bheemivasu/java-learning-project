package com.learning.extra.information;

public class MethodReturnTypes {
	/**
	 * Method Overloading: if class have same name method but with different
	 * arguments(datatypes)
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// First method to print Int on Console
		addition(10, 10);
		// Second method to return double
		double myTotal = addition(12.2, 23.3);
		System.out.println("myTotal=" + myTotal);
		// thired method to return String
		String myFamilyName = addition("vasu", "reddy");
		System.out.println("myFamilyName=" + myFamilyName);
	}

	// this method Void type,Void Key value
	// which means method doesn't return any thing
	public static void addition(int a, int b) {
		int total;
		total = a + b;
		System.out.println("Total: " + total);
	}

	// return Method,it will return some results like int, String,double,flot
	public static double addition(double a, double b) {
		double total;
		total = a + b;
		return total;
	}

	// return Method,it will return some results
	public static String addition(String firstName, String lastName) {
		String myFullName;
		myFullName = firstName + lastName;
		return myFullName;
	}
}
