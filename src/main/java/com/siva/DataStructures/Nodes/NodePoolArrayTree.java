package com.siva.DataStructures.Nodes;

/**
 * implementing nodepool array tree
 * 
 * 
 * 
 */
public abstract class NodePoolArrayTree {
	private int numNodes, nextAvail;// nextAvail point to next available node
	private NodePoolTreeNode[] arrayNodes;
	protected int root;

	// we allocate the arrayNodes array to hold the node-pool
	private void init() {
		int i;
		root = -1;// null node indicator
		arrayNodes = new NodePoolTreeNode[numNodes];
		nextAvail = 0;
		for (i = 0; i < numNodes; i++) {
			arrayNodes[i] = new NodePoolTreeNode(-1, i + 1);
			getNode(i - 1).setRight(-1);
		}

	}

	public NodePoolArrayTree() {
		numNodes = 500;
		init();
	}

	public NodePoolArrayTree(int number) {
		numNodes = number;
		init();

	}

	protected int getNode() {
		int i = nextAvail;
		nextAvail = getNode(nextAvail).getRight();
		if (nextAvail == -1) {
			nextAvail = i;
			return -1;
		}
		return i;
	}

	protected void freeNode(int n) {
		getNode(n).setRight(nextAvail);
		nextAvail = n;

	}

	public boolean isEmpty() {
		return getRoot() == -1;

	}

	public boolean isFull() {
		int i = getNode();
		if (i != -1) {
			freeNode(i);
			return false;
		}
		return true;
	}

	protected Object getData() {
		if (isEmpty())
			return null;
		return getNode(getRoot()).getData();
	}

	protected void setData(Object obj) {
		if (isEmpty())
			root = getNode();
		getNode(root).setData(obj);
		getNode(root).setLeft(-1);
		getNode(root).setRight(-1);

	}

	protected int getLeft() {
		if (isEmpty()) {
			return -1;

		}

		return getNode(getRoot()).getLeft();
	}
	// getnode

	protected NodePoolTreeNode getNode(int num) {
		if (num != -1)
			return arrayNodes[num];
		else
			return null;
	}

	// get root
	protected int getRoot() {
		return root;
	}

	// set left
	protected void setLeft(int n) {
		if (isFull())
			return;
		if (isEmpty()) {
			root = getNode();
			getNode(getRoot()).setRight(-1);

		}
		getNode(getRoot()).setLeft(n);

	}

	protected void setRight(int n) {
		if (isFull())
			return;
		if (isEmpty()) {
			root = getNode();
			getNode(getRoot()).setLeft(-1);

		}
		getNode(getRoot()).setRight(n);
	}
	// get right

	protected int getRight() {
		if (isEmpty())
			return -1;
		return getNode(root).getRight();

	}
	// insertleft

	protected void insertLeft(int node, Object obj) {
		if (node != -1 && (getNode(node).getLeft() == -1) && !isFull()) {
			int i = getNode();
			getNode(i).setData(obj);
			getNode(i).setRight(-1);
			getNode(node).setRight(i);

		}
	}

	// insert right

	protected void insertRight(int node, Object obj) {
		if (node != -1 && (getNode(node).getRight() == -1) && !isFull()) {
			int i = getNode();
			getNode(i).setData(obj);
			getNode(i).setRight(-1);
			getNode(i).setRight(i);
		}

	}

	/*
	 * -------------------------------------------------------------------------
	 * ---------------------------------------------------------- | | methods
	 * for printting traversal |
	 * -------------------------------------------------------------------------
	 * ----------------------------------------------------------
	 * 
	 */
	public void print(int mode) {
		switch (mode) {
		case 1:
			pretrav();
			break;
		case 2:
			intrav();
			break;
		case 3:
			postrav();
			break;
		}
	}

	public void pretrav() {
		pretrav(getRoot());

	}

	private void pretrav(int p) {

		if (p == -1)
			return;
		System.out.println(getNode(p).getData() + " ");
		pretrav(getNode(p).getLeft());
		pretrav(getNode(p).getRight());

	}

	public void intrav() {
		intrav(getRoot());

	}

	private void intrav(int p) {
		if (p == -1) {
			return;
		}
		System.out.println(getNode(p).getData());
		intrav(getNode(p).getLeft());
		intrav(getNode(p).getRight());

	}

	public void postrav() {
		postrav(getRoot());

	}

	private void postrav(int p) {
		if (p == -1)
			return;
		System.out.println(getNode(p).getData());
		postrav(getNode(p).getLeft());
		postrav(getNode(p).getRight());
	}
}