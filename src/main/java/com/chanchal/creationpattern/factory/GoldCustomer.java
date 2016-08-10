package com.chanchal.creationpattern.factory;

/** 
 * Concrete implementation of ICustomer interface
 * */
public class GoldCustomer implements ICustomer {

	public void AddPoints() {
		System.out.println("Gold Customer - Points Added");
	}

	public void AddDiscount() {
		System.out.println("Gold Customer - Discount Added");
	}

	public void GoldOperation() {
		System.out.println("Operation specific to Gold Customer");
	}

}
