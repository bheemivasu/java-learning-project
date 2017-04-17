package com.learning.collection.arraylist;

import java.util.ArrayList;

public class ArrayListCollection {

	// String array List declaration
	ArrayList<String> myName = new ArrayList<String>();
	// Integer Array Declaration
	ArrayList<Integer> age = new ArrayList<Integer>();
	// Double Array Declaration
	ArrayList<Double> salary = new ArrayList<Double>();

	/**
	 * 1)arrayList need Declaration 
	 * 2)specific dataType
	 *  3)arrayList will allow duplication of values
	 *  4)arrayList follows in order 
	 *  5)arrayList is dynamic Size,not fixed length 
	 *  5)can add many data and also we can remove by index or value
	 */

	public void getAge() {
		age.add(1);
		age.add(2);
		age.add(3);
		System.out.println("arrary size=" + age.size());
		for (int i = 0; i < age.size(); i++) {
			System.out.println("ages==" + age.get(i));
		}
	}

	public void getMyNames() {
		// adding to Array
		myName.add("raj");
		myName.add("raj");
		myName.add("raj");
		myName.add("rihu");
		myName.add("rihaansh");
		myName.add("manju");
		myName.add("vasu");
		myName.add("reddy");
		// remove it from array
		myName.remove("raj");
		myName.add("Test");
		// replace
		myName.add(0, "Hey Buddy");

		System.out.println("length of myName array:" + myName.size());
		for (int i = 0; i < myName.size(); i++) {
			System.out.println("names==" + myName.get(i));

		}

	}

}
