package com.siva.DataStructures.Nodes;

/**
 * program for reusing the code
 * 
 * 
 */
public class EsayStack {
	protected LinkedList list;

	public EsayStack() {
		list = new LinkedList();
	}

	public boolean isEmty() {
		return list.isEmpty();
	}

	public void push(Object obj) {
		list.insert(obj);
	}

	public Object pop() {
		return list.remove();
	}

}
