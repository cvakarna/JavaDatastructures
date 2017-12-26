package com.siva.DataStructures.Nodes;

/**
 * 
 * @author cva
 *
 */
public class DoubleLinkedList {
	private TwoChildNode head, tail;
	protected long num;

	protected TwoChildNode getHead() {
		return head;
	}

	protected TwoChildNode getTail() {
		return tail;
	}

	protected void setHead(TwoChildNode p) {
		head = p;

	}

	protected void setTail(TwoChildNode p) {
		tail = p;

	}

	public DoubleLinkedList() {
		setHead(new TwoChildNode());
		setTail(new TwoChildNode());
		getTail().setLeft(head);
		getHead().setRight(tail);
		num = 0;

	}// end constructor

	// method to know abt the size
	public long size() {
		return num;
	}

	// method to kno abt the list is empty or not
	public boolean isEmpty() {
		return num == 0;
	}

	// method for adding nodes in head
	public void addHead(Object obj) {

		TwoChildNode p = new TwoChildNode(obj);
		p.setLeft(getHead());
		p.setRight(getHead().getRight());
		getHead().setRight(p);
		p.getRight().setLeft(p);
		num++;

	}

	// method for removing head nodes

	public Object removeHead() {
		Object obj = null;
		if (!isEmpty()) {
			TwoChildNode p = getHead().getRight();
			getHead().setRight(p.getRight());
			p.getRight().setLeft(getHead());
			obj = p.getData();
			num--;

		}
		return 0;

	}

	// method for adding nodes in tail
	public void addTail(Object obj) {
		TwoChildNode p = new TwoChildNode(obj);
		p.setRight(getTail());
		p.setLeft(getTail().getLeft());
		getTail().setLeft(p);
		p.getLeft().setRight(p);
		num++;

	}

	public Object removeTail() {
		Object o = null;
		if (!isEmpty()) {
			TwoChildNode p = getTail().getLeft();
			getTail().setLeft(p.getLeft());
			p.getLeft().setRight(getTail());
			o = p.getData();
			num--;
		}
		return o;
	}

	// methods for adding obj and removing objs
	public void add(Object o) {
		addHead(o);
	}

	public Object remove() {
		return removeHead();
	}

	// enumration

}
