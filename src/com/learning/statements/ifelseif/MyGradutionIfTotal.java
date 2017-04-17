package com.learning.statements.ifelseif;

public class MyGradutionIfTotal extends IfElseIfAddition {

	/**
	 * IF else statement
	 */
	public void myClassRank() {
		int myScore = additionOfSubjects(123,0,0);
		// If Condition true
		if (myScore == 100) {
			System.out.println("100% percenatage marks");
			// If condition false
		} else if (myScore >= 80 && myScore < 100) {
			System.out.println("2nd class rank");
		} else if (myScore == 50 && myScore <= 79) {
			System.out.println("3rd class rank");
		} else if (myScore <= 49 && myScore >= 35) {
			System.out.println("last rank");
		} else if (myScore < 35) {
			System.out.println("fail");
		} else {
			System.out.println("invalid input");

		}
	}
}