package com.chanchal.creationpattern.factory;

/**
 * This is factory class which provide instance of ICustomer implementation
 * based on input it receives. Please Visit FactoryPatternExample class to
 * understand more.
 * */
public class CustomerProvider {
	public static ICustomer GetCustomer(String i) {
		switch (i) {
		case "GOLD":
			GoldCustomer goldCustomer = new GoldCustomer();
			return goldCustomer;
		case "SILVER":
			SilverCustomer silverCustomer = new SilverCustomer();
			return silverCustomer;
		default:
			return null;
		}
	}
}
