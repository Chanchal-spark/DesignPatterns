package com.chanchal.creationpattern.factory;

import java.util.Scanner;

/**
 * Most Object-Oriented languages have great flexibility at the method call
 * level through polymorphism. At the creation side however, you have to say new
 * X() where X is a specific type.
 * 
 * The factory method pattern deals with the problem of creating objects
 * (products) without specifying the exact class of object that will be created.
 * Factory method handles this problem by defining a separate method for
 * creating the objects, which subclasses can then override to specify the
 * derived type of product that will be created.
 * 
 * More generally, the term factory method is often used to refer to any method
 * whose main purpose is creation of objects.
 * 
 * 
 * Use a Factory Method when
 * 
 * 1. a class can't anticipate the class of objects it must create. 2. a class
 * wants its subclasses to specify the objects it creates. 3. classes delegate
 * responsibility to one of several helper subclasses, and you want to localize
 * the knowledge of which helper subclass is the delegate.
 * **/
public class FactotyPatternExample {
	public static void main(String[] args) {
		System.out
				.println("Enter your choice of custmer type \n 1.GOLD for GoldCustomer \n 2.SILVER for silver customer ");
		Scanner sc = new Scanner(System.in);
		String customerType=sc.nextLine();
		ICustomer customer=CustomerProvider.GetCustomer(customerType);
		customer.AddDiscount();
		customer.AddPoints();

	}
}
