package com.siva.DataStructures.PriorityVectors;

import java.util.Vector;

public class PriorityVector extends Vector<Integer> {

	private static final long serialVersionUID = 7893735622144886063L;

	public void addElement(Comparable<Integer> obj) {
		int j = size();
		for (int i = 0; i < j && (((Comparable<Integer>) elementAt(i))).compareTo((Integer) obj) < 0; i++) {

			insertElementAt((Integer) obj, i);
		}

	}

}
