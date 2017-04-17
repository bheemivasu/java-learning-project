package com.learning.collections.arrays;

public class ArraysIntList {

	public static void main(String[] args) {
   int[] num=new int[10];
   num[0]=1;
   num[1]=2;
   num[2]=3;
   num[3]=4;
   num[4]=5;
   num[5]=6;
  
   for (int i = 0; i < num.length; i++) {
	System.out.println("Arrays nums"+num[i]);
}
   System.out.println("Array lenght="+num.length);
	}
}
