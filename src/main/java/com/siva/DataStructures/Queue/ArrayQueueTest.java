package com.siva.DataStructures.Queue;

public class ArrayQueueTest {
	public static void queueTest() {
		ArrayQueue aq = new ArrayQueue(5);
		for (int i = 0; i < 5; i++) {
			int insert = (int) (Math.random() * 100);
			aq.insert(insert);
			System.out.println("insert:" + insert);
		}
		if (!aq.isEmpty()) {
			System.out.println("remove:" + aq.remove());
		}

	}

	public static void main(String[] args) {
		queueTest();
	}

}
