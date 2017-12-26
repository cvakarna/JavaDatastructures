package com.siva.DataStructures.Nodes;

/**
 * 
 * @author siva
 *
 */
public class BinarySearchTree extends GenericBinaryTree {

	public BinarySearchTree() {
		super();
	}

	public BinarySearchTree(Object obj) {
		super(obj);
	}

	public void print() {
		print(2);
	}

	public void insert(Comparable obj) {
		TwoChildNode t, q;
		for (q = null, t = getRoot(); t != null
				&& obj.compareTo(t.getData()) != 0; q = t, t = obj.compareTo(t.getData()) < 0 ? t.getLeft()
						: t.getRight())
			;

		if (t != null) {
			return;
		} else if (q == null) {
			setRoot(new TwoChildNode(obj));

		} else if (obj.compareTo(q.getData()) < 0)
			insertLeft(q, obj);
		else
			insertRight(q, obj);
	}

}
