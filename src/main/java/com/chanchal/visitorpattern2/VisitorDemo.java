package com.chanchal.visitorpattern2;




interface Element {
	public void accept(Visitor V);
}

// abstract visitor class
interface Visitor {
	// in place of visit, the functions have to be inorder and preorder
	public void visit(BinaryTre bt);

	// public void preorder( Binary_tree t );
}

// now we need to create concrete visitor, which will be inorder and preorder in
// this case but name of the function has to be visit

class Inorder_visitor implements Visitor {

	public void visit(BinaryTre bt) {
		System.out.println("this is inorder traversal"); // inorder

		if (bt.left != null) {
			visit(bt.left);
		}
		System.out.println(bt.data);
		if (bt.right != null) {
			visit(bt.right);
		}
	}

}

class Preorder_visitor implements Visitor // preorder
{
	// binary_tree bt = new binary_tree();

	public void visit(BinaryTre bt) {

		System.out.println("this is preorder traversal");
		/*
		 * System.out.println(bt.focusNode.key); if(bt.focusNode != null) {
		 * visit(bt.focusNode.leftChild); System.out.println(bt.focusNode.key);
		 * visit(bt.focusNode.rightChild); }
		 */

		System.out.println(bt.data);
		if (bt.left != null) {
			visit(bt.left);
		}
		if (bt.right != null) {
			visit(bt.right);
		}

	}

}

// our object is the tree

class BinaryTre implements Element {
	int data;
	BinaryTre left;
	BinaryTre right;

	public BinaryTre(int num) {
		this.data = num;
		this.left = null;
		this.right = null;
	}

	public void addNode(int num) {
		if (num < this.data) {
			if (this.left != null) {
				this.left.addNode(num);
			} else {
				this.left = new BinaryTre(num);
			}
		} else {
			if (this.right != null) {
				this.right.addNode(num);
			} else {
				this.right = new BinaryTre(num);
			}

		}
	} // end of addNode function

	public void accept(Visitor v) {
		v.visit(this);

	}

}// end of class BinaryTre

public class VisitorDemo {
	/*
	 * public static void main(String args[]) { binary_tree bt = new
	 * binary_tree(); bt.addNode(10); bt.addNode(16); bt.addNode(20);
	 * bt.addNode(8); bt.addNode(5); //System.out.println(bt.root.key);
	 * Preorder_visitor pv = new Preorder_visitor(); Inorder_visitor iv = new
	 * Inorder_visitor(); Node n= bt.root; System.out.println(n.key);
	 * 
	 * n.accept(pv); n.accept(iv);
	 * 
	 * }
	 */
	public static void main(String args[]) {
		System.out.println("Hello to visitor implementation ");
		BinaryTre tree = new BinaryTre(20);
		int[] nums = { 15, 200, 25, -5, 0, 100, 20, 12 };
		for (int i : nums) {
			tree.addNode(i);
		}

		Preorder_visitor pv = new Preorder_visitor();
		Inorder_visitor iv = new Inorder_visitor();
		tree.accept(pv);
		tree.accept(iv);

	}
}
