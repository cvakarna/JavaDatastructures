package com.siva.DataStructures.Nodes;

/**
 * implementing the node pool sort array tree
 * 
 */
public class NodePoolSorArrayTree extends NodePoolArrayTree {
	public NodePoolSorArrayTree() {
		super();
	}

	public NodePoolSorArrayTree(int i) {
		super(i);
	}

	public void print() {
		print(2);
	}

	public void insert(Comparable obj) {
		int t, q = -1;
		t = getRoot();
		while (t != -1 && !(obj.equals(getNode(t).getData()))) {
			q = t;
			if (obj.compareTo(getNode(t).getData()) < 0) {
				t = getNode(t).getLeft();

			} else
				t = getNode(t).getRight();
		}
		if (t != -1) {
			return;

		}
		if (q == -1) {
			setData(obj);
			return;

		}
		if (obj.compareTo(getNode(q).getData()) < 0)
			insertLeft(q, obj);
		else
			insertRight(q, obj);
	}
}
