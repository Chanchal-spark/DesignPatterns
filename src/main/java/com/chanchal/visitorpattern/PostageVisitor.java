package com.chanchal.visitorpattern;

public class PostageVisitor implements Visitor {
	  private double totalPostageForCart;
	  public void visit(Book book) {
	    //free postage for a book over 10 
	    if(book.getPrice() >10.0) {
	      totalPostageForCart += book.getWeight() * 2;
	    }
	  }
	  //return the internal state
	  public double getTotalPostage() {
	    return totalPostageForCart;
	  }
}
