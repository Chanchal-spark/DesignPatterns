package com.chanchal.visitorpattern;

public class VisitorPatternExample {
	public static void main(String[] args) {
		Book book=new  Book();
		book.setPrice(1000);
		book.setWeight(1000);
		PostageVisitor visitor=new PostageVisitor();
		book.accept(visitor);
		visitor.visit(book);
		
		System.out.println("Price of book is "+visitor.getTotalPostage());
		
	};
}
