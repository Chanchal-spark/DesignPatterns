package com.chanchal.creationpattern.factory;

/**
 * Concrete implementation of ICustomer interface
 * */

public class SilverCustomer implements ICustomer {

	public void AddPoints() {
		System.out.println("Silver Customer -  Points Added");
	}

	public void AddDiscount() {
		System.out.println("Silver Customer - Discount Added");
	}

	public void SilverOperation() {
		System.out.println("Operation specific to Silver Customer");
	}

}
