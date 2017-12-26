
package com.siva.DataStructures.Nodes;

public class BreadthFirstTraversalTest {
	
	public static void test()
	{ 
		int number;
		BreadthFirstTraversal bft = new BreadthFirstTraversal();
		System.out.println("numbers inserted.....");
		for (int i = 0; i < 10; i++) {
			Integer n = new Integer((int)(i*Math.random()*1000));
			bft.insert(n);
			System.out.print(n+" ");
			System.out.println();
		}
		System.out.println("pre order:");
		bft.print(1);
		System.out.println("in oerder:");
		bft.print(2);
		System.out.println("postorder");
		bft.print(3);
		System.out.println("breadth first:");
		bft.breadth_first();
	}
public static void main(String[] args) {
	test();
}
}
