package com.learning.abstractclass.concept;

/**
 * 1)abstract class which has at least one abstract method 
 * 2)some methods have
 * implementation some methods doesn't have implementation
 *  3)use keyword"abstract"
 *  4)if java class have on abstract method that class as abstract
 * class
 * 
 * @author bheemivasu
 *
 */
public abstract class CreditCard {

	public void ccFirstName(String firstName) {
		System.out.println("creditcard firstname=" + firstName);
	}

	public void ccLastName(String lastName) {
		System.out.println("creditcard lastname=" + lastName);
	}

	public void ccNumber(long cardNumber) {
		System.out.println("creditcard cardNumber=" + cardNumber);
	}

	public void ccCsvNumber(int securityCode) {
		System.out.println("cardcode="+securityCode);
	}
}
