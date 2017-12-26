package com.siva.DataStructures.Nodes;

public class Integer implements Comparable {
	int i;

	public Integer() {

	}

	public Integer(int d) {
		set((int) d);
	}

	public int compareTo(Object obj) {
		if (obj instanceof Integer) {
			if (get() > ((Integer) obj).get())
				return 1;
		} else if (get() < ((Integer) obj).get())
			return -1;

		return 0;

	}

	public int get() {
		return i;
	}

	public void set(int d) {
		this.i = d;
	}

	public String toString() {
		return " " + get();
	}

}
