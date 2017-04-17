package com.learning.strings.concept;

public class StringsConceptTest {
	public static String firstName;
	public static String lastName;
	public static String schoolName;
	
	//String additions with concat method(adding two or more strings)
    public static String stringConcation(){
    	firstName=" bheemi ";
    	lastName="reddy";
    	String fullName=firstName.concat(lastName);
    	return fullName;
    }
    //trim method whihc removes the extra spaces in the String
    public static void stringTrimMethod(){
    	schoolName="     Vanividyalayam ";
    	String trimMySchoolName=schoolName.trim();
    	System.out.println(trimMySchoolName);
    }
    
    //string replace old char with new char
    public static void replceCharString(){
    	schoolName="Vani-vidyalayam";
    	String trimMySchoolName=schoolName.replace("Vani", "VidhyaBhartha");
    	System.out.println(trimMySchoolName);
    }
    //calculate String char and return int
    public static void stringLength(){
    	schoolName="vani";
    	int myStringLength=schoolName.length();
    	System.out.println(myStringLength);	
    }
    
    //String in UPPERCASE and LOWERCASE
    public static void stringUpperLowerCase(){
    	String kidName="rihansh reddy";
    	String politicalName="TRS";
    	System.out.println(kidName.toUpperCase());
    	System.out.println(politicalName.toLowerCase());
    }
    //split method 
    public static void stringSplit(){
    	String kidName="rihansh1reddy1ghani1raj";
    	String[] kidChar=kidName.split("1");
    	for (int i = 0; i < kidChar.length; i++) {
    		System.out.println(kidChar[i]);	
		}    		
    }
    //Index of
    public static void stringIndexOf(){
    	String kidName="rihanshreddy";
    	System.out.println(kidName.indexOf(3));
    }
    
   
    	public static void main(String[] args) {
    		StringsConceptTest name= new StringsConceptTest();
    		String myName=name.stringConcation();
    		System.out.println(myName);
    		
    		//trim method output
    		name.stringTrimMethod();
    		//String Length method
    		name.stringLength();
    		//string replace method
    		name.replceCharString();
    		//string upper and lower cases
    		name.stringUpperLowerCase();
    		//string split method
    		name.stringSplit();
    		//string index
    		name.stringIndexOf();
    		
	}

}
