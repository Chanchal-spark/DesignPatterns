package com.chanchal.visitorpattern2;

public class VisitorDemo2 // main function
{
	public static void main(String args[]) {
		Node tree = new OpNode("=");
		tree.left = new ValueNode(1);
		tree.right = new ValueNode(2);
		ToStringVisitor toStringVisitor = new ToStringVisitor();
		tree.accept(toStringVisitor);
	}

}

interface IVisitor // two kinds of visit function for OpNode and ValueNode
{
	void visit(OpNode opNode);

	void visit(ValueNode valueNode);
}

class ToStringVisitor implements IVisitor // the class implementing the Visitor

{

	public void visit(OpNode opNode) // visit function of argument type OpNode
	{
		opNode.left.accept(this);
		if (opNode.operator.equals("="))

			System.out.print(" Equals ");
		opNode.right.accept(this); // accept function accepts the argument of
									// type Visitor
	}

	public void visit(ValueNode valueNode) // visit function of argument type
											// ValueNode
	{
		System.out.print("Numeral" + valueNode.value);
	}
}

abstract class Node // try with interface ??
{
	Node left;
	Node right;

	abstract void accept(IVisitor V);
}

class OpNode extends Node // two classes.. OpNode and ValueNode extending teh
// class Node
{
	String operator;

	OpNode(String operator) // constructor
	{
		this.operator = operator;
	}

	void accept(IVisitor v) {
		v.visit(this);
	}
}

class ValueNode extends Node // two classes ValueNode and OpNode extending Node
{
	Integer value; // what is the use of using wrappper class here

	ValueNode(Integer value) {
		this.value = value;
	}

	void accept(IVisitor V) {
		V.visit(this);
	}
}
