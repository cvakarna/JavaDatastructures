package com.siva.DataStructures.Nodes;

/**
 * 
 * implementation of generic binary tree
 * 
 * 
 */
public abstract class GenericBinaryTree {
	private TwoChildNode root;

	protected TwoChildNode getRoot() {
		return root;
	}

	protected void setRoot(TwoChildNode root) {
		this.root = root;
	}

	public GenericBinaryTree() {
		setRoot(null);
	}

	public GenericBinaryTree(Object obj) {
		root = new TwoChildNode(obj);
	}

	public boolean isEmpty() {
		return getRoot() == null;
	}

	public Object getData() {
		if (!isEmpty())
			return getRoot().getData();
		return null;
	}

	public TwoChildNode getLeft() {
		if (!isEmpty()) {
			return getRoot().getLeft();
		}
		return null;
	}

	public TwoChildNode getRight() {
		if (!isEmpty())
			return getRoot().getRight();
		return null;
	}

	public void setData(Object obj) {

		if (!isEmpty())
			getRoot().setData(obj);
	}

	/*
	 * 
	 * insertLeft(pTwoChildNode,Object), and insertRight(pTwoChildNode,Object).
	 * These provide a nice way to quickly insert something into the left child
	 * (sub-tree) of the given node.
	 * 
	 */
	public void insertLeft(TwoChildNode twochild, Object obj) {
		if ((twochild != null) && (twochild.getLeft() != null)) {
			twochild.setLeft(new TwoChildNode(obj));
		}
	}

	public void insertRight(TwoChildNode twochild, Object obj) {
		if ((twochild != null) && (twochild.getRight() != null)) {
			twochild.setRight(new TwoChildNode(obj));

		}
	}

	/*
	 * 
	 * print out the whole tree, in different traversals
	 */
	public void print(int mode) {
		if (mode == 1)
			preTrav();
		else if (mode == 2)
			inTrav();
		else
			postTrav();

	}

	public void preTrav() {
		preTrav(getRoot());
	}

	protected void preTrav(TwoChildNode child) {
		if (child == null) {
			return;

		}
		System.out.println(child.getData() + " ");
		preTrav(child.getLeft());
		preTrav(child.getRight());

	}

	public void inTrav() {
		inTrav(getRoot());

	}

	protected void inTrav(TwoChildNode child) {
		if (child == null) {
			return;
		}
		System.out.println(child.getData() + " ");
		inTrav(child.getLeft());
		inTrav(child.getRight());
	}

	public void postTrav() {
		postTrav(getRoot());

	}

	protected void postTrav(TwoChildNode child) {
		if (child == null) {
			return;
		}
		System.out.println(child.getData() + " ");
		postTrav(child.getLeft());
		postTrav(child.getRight());

	}
}
