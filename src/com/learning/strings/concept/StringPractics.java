package com.learning.strings.concept;

public class StringPractics {
	public static String fristname;
	public static String lastname;
	public static String fullname;

	// concat method
	public static String concat() {
		fristname = "vasu";
		lastname = "reddy";
		fullname = fristname.concat(lastname);
		return fullname;
	}

	// trim method
	public static String stringTrimMethod() {
		fullname = " satya vasu deva reddy ";
		String all=fullname.trim();
		return all;
	}

	

	public static void main(String[] args) {
		StringPractics sp = new StringPractics();
		String ns = sp.concat();
		System.out.println(ns);
		String fn = sp.stringTrimMethod();
		System.out.println(fn);
	}

}
