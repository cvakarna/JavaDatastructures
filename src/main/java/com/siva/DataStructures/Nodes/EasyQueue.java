package com.siva.DataStructures.Nodes;

/**
 * 
 * program to devolop Queue using resuability code
 * 
 **/
public class EasyQueue {
	protected LinkedList list;

	public EasyQueue() {
		list = new LinkedList();

	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void insert(Object obj) {
		list.insert(obj);
	}

	public Object remove() {
		return list.remove();
	}

}
