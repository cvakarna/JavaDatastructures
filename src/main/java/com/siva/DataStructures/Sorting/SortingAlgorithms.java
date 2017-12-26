package com.siva.DataStructures.Sorting;

public class SortingAlgorithms {

	public static void bubbleSort(int[] a) {
		boolean switched = true;
		for (int i = 0; i < a.length - 1 && switched; i++) {
			switched = false;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > (a[j + 1])) {
					switched = true;
					int hold = a[j];
					a[j] = a[j + 1];
					a[j + 1] = hold;
				} // end if

			} // end inner loop

		} // end outer loop
	}

	public static void selectionSort(int[] a) {
		int i, j;
		for (i = 0; i < a.length - 1; i++) {
			int min = a[i];
			for (j = i + 1; j < a.length - 1; j++) {
				if (a[j] < a[min]) {
					min = a[j];
				}

			}
			if (min != j) {
				int hold = a[j];
				a[j] = a[j + 1];
				a[j + 1] = hold;
			}
		}

	}

	/*
	 * 
	 * insertion sort
	 * 
	 */
	public static void insertionSort(Comparable<Integer>[] a) {

		int i, j;
		Comparable<Integer> e;
		for (i = 0; i < a.length; i++) {
			e = a[i];
			for (j = i - 1; j >= 0 && a[j].compareTo((Integer) e) > 0; j--)
				a[j + 1] = a[j];
			a[j + 1] = e;

		}

	}

	/*
	 * Heap sort
	 * 
	 */
	public static void heapSort(Comparable[] a)

	{

		int i, f, s;
		for (i = 1; i < a.length; i++) {
			Comparable e = a[i];
			s = i;
			f = (s - 1) / 2;
			while (s > 0 && a[f].compareTo(e) < 0) {
				a[s] = a[f];
				s = f;
				f = (s - 1) / 2;

			}
			a[s] = e;

		}
		for (i = a.length - 1; i > 0; i--) {
			Comparable value = a[i];
			f = 0;
			if (i == 1)
				s = -1;
			else
				s = 1;
			if (i > 2 && value.compareTo(a[1]) > 0)
				s = 2;
			while (s >= 0 && value.compareTo(a[s]) < 0) {
				a[f] = a[s];
				f = s;
				s = 2 * f + 1;
				if (s + 1 <= i - 1 && a[s].compareTo(a[s + 1]) < 0)
					s = s + 1;
				if (s > i - 1)
					s = -1;

			}
			a[f] = value;

		}

	}

	public static void read() {
		Integer[] integer = { 1, 5, 7, 3, 8, 9 };
		System.out.println("starting.....");
		for (int i = 0; i < integer.length - 1; i++)
			System.out.print(" " + integer[i]);

		System.out.println();
		System.out.println("Done!!.....");
		// bubbleSort(integer);
		insertionSort(integer);
		// heapSort(integer);
		for (int i = 0; i < integer.length - 1; i++) {

			System.out.print(integer[i] + "  ");

		}

	}

	public static void main(String[] args) {
		read();
	}
}
