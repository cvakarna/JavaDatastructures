package com.siva.DataStructures.Nodes;

/**
 * 
 * example for statck
 * 
 */
public class EsayStackTest {
	public static void testStack() {
		EsayStack es = new EsayStack();
		Integer j = null;
		int i;
		System.out.println("starting.......");
		// adding elements randomly into statck
		for (i = 0; i < 10; i++) {
			j = new Integer((int) (Math.random() * 100));
			es.push(j);
			System.out.println("push:" + j);
		} // end for
			// removing elements from the statck
		while (!es.isEmty()) {
			System.out.println("pop:" + es.pop());
		} // end while
		System.out.println("Done!!!");
	}

	public static void main(String[] args) {// program starts from here
		// invoking static method
		testStack();
	}

}
