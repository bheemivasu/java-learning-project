package com.learning.varibles.concept;

public class Customer {
	
//3 are instant variables 
 public String name="vasu";
 public int age=25;
 public String mobileNew="9948963896";
 
 //instant variable with out declarrition
 public String brotherName=null;
 
 
 public void getMyCustomerName(){
	 //declaring value
	  brotherName="raj"; 
	 System.out.println("CustomerName+"+brotherName);
 }
 
 public void getCustomerAddress(){
	 //Local varible
	 String streetName="120,Hyderabad";
	 System.out.println("address" +streetName);
 }
 
 
 
}
