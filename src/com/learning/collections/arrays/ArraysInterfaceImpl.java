package com.learning.collections.arrays;

public class ArraysInterfaceImpl implements ArraysInterface {

	@Override
	public void getMyMarks(int[] subjectMarks) {
		for (int i = 0; i < subjectMarks.length; i++) {
			System.out.println("subjectMarks:" + subjectMarks[i]);
		} // for end
		System.out.println("Array lenght" + subjectMarks.length);
	}

}
