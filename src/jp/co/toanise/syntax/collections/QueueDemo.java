package jp.co.toanise.syntax.collections;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
	// Queue is ”Firsr In Fisrst Out”(FIFO). 先入れ先出し

	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
	for (int i = 0; i < 10; i++) {
	    queue.add(i);
	}

	System.out.println(queue.toString());
	System.out.println(queue.peek()); // HEAD of Queue

	System.out.println(queue.poll()); // HEAD of Queue & Removing the HEAD
	System.out.println(queue.toString());
    }
}
