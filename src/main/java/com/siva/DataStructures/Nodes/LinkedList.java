package com.siva.DataStructures.Nodes;

/**
 * 
 * program for linked list
 */
public class LinkedList {
	protected OneChildNode head;
	protected int number;

	public LinkedList() {
		head = null;
		number = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int size() {
		return number;
	}

	public void insert(Object obj) {
		head = new OneChildNode(obj, head);
		number++;
	}

	public Object remove() {
		if (isEmpty())
			return null;

		OneChildNode tmp = head;
		head = tmp.getNext();
		number--;
		return tmp.getData();

	}

}
