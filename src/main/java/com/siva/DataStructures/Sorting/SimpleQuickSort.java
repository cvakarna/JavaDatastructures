package com.siva.DataStructures.Sorting;

public class SimpleQuickSort {
	public static void qsort(Comparable[] c, int start, int end) {
		if (end <= start)
			return;
		// pivot element
		Comparable comp = c[start];
		int i = start, j = end + 1;
		for (;;) {
			/*
			 * we scan the array looking for the first element which is larger
			 * than our picked element, moving from left to right of the array
			 */
			do
				i++;

			while (i < end && c[i].compareTo(comp) < 0);

			/*
			 * we scan to find an element smaller than the picked, moving from
			 * right to left in the array
			 */
			do
				j--;
			while (j > start && c[j].compareTo(comp) > 0);
			if (j <= i)
				break;
			Comparable tmp = c[i];
			c[i] = c[j];
			c[j] = tmp;
		}

		c[start] = c[j];
		c[j] = comp;
		qsort(c, start, j - 1);
		qsort(c, j + 1, end);

	}

	public static void qsort(Comparable[] c) {
		qsort(c, 0, c.length - 1);

	}

	public static void sortingRead() {
		Integer[] arr = { 1, 6, 5, 4, 3 };
		System.out.println("input array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		SimpleQuickSort.qsort(arr);
		System.out.println();
		System.out.println("sorting array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	public static void main(String[] args) {
		sortingRead();
	}
}
