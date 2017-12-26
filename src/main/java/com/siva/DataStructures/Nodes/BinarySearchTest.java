package com.siva.DataStructures.Nodes;

/**
 * 
 * @author siva
 *
 */
public class BinarySearchTest {
	public static void test() {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println("numbers inserted :");
		for (int i = 0; i < 10; i++) {
			Integer n = new Integer((int) (i * Math.random() * 100));
			bst.insert(n);
			System.out.print(" " + n);
		} // end for loop
		System.out.println("pre-orderd");
		bst.print(1);
		System.out.println("in -ordered");
		bst.print();
		System.out.println("post -ordered");
		bst.print(3);

	}

	public static void main(String[] args) {
		test();

	}

}
