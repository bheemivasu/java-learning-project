package com.learning.collections.arrays;

public class FixedLengthArray {

	public static void main(String[] args) {
		//double[] points={10.2,13.1,23.1,12.9};
		
		//Declaring double array with fixed size
		double[] points=new double[10];
	
		//add values to array
		points[0]=12.10;  //ref 0
		points[1]=12.11;   //ref 1
		points[2]=12.12;   //ref 2
		points[3]=12.13;    //ref 3
		points[4]=12.14;    //ref 4 
		points[5]=13.33;  //ref 5

		for (int i = 0; i < points.length; i++) {
			System.out.println("points Array:"+points[i]);
		}//forend
		System.out.println("Array lenght:"+points.length);
	}

}
