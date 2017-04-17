package com.learning.collections.arrays;

public class ArraysConcept {
	/**
	 * 1)Array in sequentional order 
	 * 2)fixed size
	 * 3)same dataType
	 * Ex:int,string,long,ect.. array,double array,long array, strings array
	 * 4)can not have different dataTypes in one array*
     * @param args
	 */
	public static void main(String[] args) {
		int[] age = { 10, 20, 30, 40, 50 };
		System.out.println("Age Array Length:" + age.length);
		for (int i = 0; i < age.length; i++) {
			System.out.println("Age is :" + age[i]);
		}
		String[] names = { "rihu", "raj", "vasu" };
		System.out.println("Names Array Lenght :" + names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println("Name is :" + names[i]);
		}
		float [] points ={ (float) 1.1,(float) 12.2,(float) 12.3,(float) 12.223};
		System.out.println("array length::"+points.length);
		for (int i = 0; i < points.length; i++) {
			System.out.println("points of given array::"+points[i]);
			
		}
		}
}
