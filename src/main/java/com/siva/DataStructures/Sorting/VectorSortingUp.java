package com.siva.DataStructures.Sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

public class VectorSortingUp implements Comparator {

	public int compare(Object o1, Object o2) {

		return -((Comparable) o1).compareTo(o2);
	}

	public static void vectorRead() {
		Vector v = new Vector();
		System.out.println("starting...");
		for (int i = 1; i <= 10; i++) {

			v.addElement(i);
			System.out.print(" " + i);

		}
		System.out.println();
		Collections.sort(v, new VectorSortingUp());
		System.out.print("printing...:");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(" " + enu.nextElement());

		}

	}

	public static void main(String[] args) {
		vectorRead();
	}
}
