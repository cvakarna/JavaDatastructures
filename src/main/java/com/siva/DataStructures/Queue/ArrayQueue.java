package com.siva.DataStructures.Queue;

public class ArrayQueue {
	// decalre variables;
	protected Object[] array;
	protected int start, end;
	protected boolean full;

	public ArrayQueue(int maxSize)// constructor
	{
		// create array object
		array = new Object[maxSize];
		start = end = 0;
		full = false;

	}

	// status for queue
	public boolean isEmpty() {
		return ((start == end) && !full);
	}

	// method for inserting an obj
	public void insert(Object obj) {
		if (!full) {
			array[start = (start++) % array.length] = obj;
		}
		if (start == end) {
			full = true;
		}
	}

	// method for remove
	public Object remove() {
		if (full) {
			full = false;
		} else if (isEmpty()) {
			return null;
		}
		return array[end = (end++) % array.length];
	}

}