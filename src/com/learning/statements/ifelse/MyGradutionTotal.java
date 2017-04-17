package com.learning.statements.ifelse;

public class MyGradutionTotal extends IfElseAddition{

	/**
	 * IF else statement
	 */
	public void myClassRank(){
		int myScore=additionOfSubjects(25,50,25);
		//If Condition true 
		if(myScore>100){
			System.out.println("1st class");
			//If condition false
		  }else{
			  System.out.println("i got other rank");
		  }
	}
}