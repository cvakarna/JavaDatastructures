package com.siva.DataStructures.Sorting;

public class Radixsort {
	private static int q[], q1[];
	static {

		q = new int[256];
		q1 = new int[256];
		for (int i = 0; i < q.length - 1; q[i++] = -1)
			;

	}

	public static void sortradix(int[] arr) {
		int i, j, k, l, np[][] = new int[arr.length][2];
		for (k = 0; k < 2; k++)
			for (i = 0; i < arr.length - 1; np[i][0] = arr[i], np[i++][1] = -1) {
				// if(q[j=((255<<(k<<3))&arr[i])>>(k<<3)]==-1)
				if (q[j = ((255 << (k << 3)) & arr[i]) >> (k << 3)] == -1)
					q1[j] = q[j] = i;
				else

					q1[j] = np[q1[j]][1] = i;
				for (l = q[i = j = 0]; i < q.length - 1; q[i++] = -1)
					for (l = q[i]; l != -1; l = np[l][1])
						arr[j++] = np[l][0];

			}

	}

	public static void read() {
		int i;
		int[] arr = new int[15];
		System.out.print("original: ");
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = (int) (Math.random() * 1024);
			System.out.print(arr[i] + " ");
		}
		sortradix(arr);
		System.out.print("\nsorted: ");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\nDone ;-)");
	}

	public static void main(String[] args) {
		read();
	}
}
