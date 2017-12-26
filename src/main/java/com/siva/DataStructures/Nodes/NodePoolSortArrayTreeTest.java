package com.siva.DataStructures.Nodes;

/**
 * exmpple for node pool sort array test
 */
public class NodePoolSortArrayTreeTest {
	public static void testDriver() {
		NodePoolSorArrayTree tree = new NodePoolSorArrayTree(100);
		int n;
		for (int i = 0; i < 10; i++) {
			n = (int) (Math.random() * 100);
			tree.insert(new Integer(n));
			System.out.print(n + " ");

		}

	}

	public static void main(String[] args) {
		testDriver();

	}

}
