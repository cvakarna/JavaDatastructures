package com.siva.DataStructures.Sorting;
/*
 * program to determine the binary tree depth
 * 
 */

import org.apache.log4j.Logger;

public class BinaryTreeDepth {
	static Logger logger = Logger.getLogger(BinaryTreeDepth.class);

	BinaryTreeDepth left, right;
	public Integer data;
	public static int[] numbers = { 56, 86, 71, 97, 82, 99, 65, 36, 16, 10, 28, 52, 46 };
	private static int tree_depth, current_depth = 0;

	// method for adding the nodes
	public static BinaryTreeDepth add(BinaryTreeDepth r, Integer n) {
		if (r == null) {
			r = new BinaryTreeDepth();
			r.left = r.right = null;
			r.data = n;
		} else if (r.data.compareTo(n) < 0) {
			r.right = add(r.right, n);

		} else {
			r.left = add(r.left, n);

		}
		return r;

	}// end method

	// print method for printing the nodes
	public static void print(BinaryTreeDepth r) {
		if (r != null) {
			print(r.left);
			logger.info("\t" + r.data);
			print(r.right);

		} // end if
	}// end method

	// method for getting the depth

	public static void _getDepth(BinaryTreeDepth r) {
		if (r != null) {
			current_depth++;
			if (current_depth > tree_depth)
				tree_depth = current_depth;
			_getDepth(r.left);
			_getDepth(r.right);
			current_depth--;

		} // end if
	}// end method

	// method for determining the depth

	public static int getDepth(BinaryTreeDepth r) {
		tree_depth = 0;
		_getDepth(r);
		return tree_depth;
	}// end method

	// method for all operations to call
	public static void readOperation() {
		BinaryTreeDepth tree = null;
		logger.info("inserting....");
		for (int i = 0; i < numbers.length; i++) {
			Integer n = new Integer(numbers[i]);
			logger.info("\t");
			logger.info("\t" + n);
			tree = add(tree, n);
		} // end for
		logger.info("tree:");
		print(tree);
		logger.info("\ndepth:" + getDepth(tree));
		logger.info("Done!.....");
	}// end method

	/// main method

	public static void main(String[] args) {
		// invoke the readOperation method
		readOperation();

	}

}
