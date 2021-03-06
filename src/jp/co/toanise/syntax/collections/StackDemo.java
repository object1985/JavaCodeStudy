package jp.co.toanise.syntax.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDemo {
    public static void main(String[] args) {
	// Deque is ”Firsr In Fisrst Out”(FIFO). 先入れ先出し/ ”Last In Fisrst Out”(LIFO). 後入れ先出し

	Deque<Integer> deque = new ArrayDeque<>();
	for (int i = 0; i < 10; i++) {
	    deque.add(i);
	}

	System.out.println(deque.toString());
	System.out.println(deque.peek()); // HEAD of deque

	System.out.println(deque.poll()); // HEAD of deque & Removing the HEAD
	System.out.println(deque.toString());

	Deque<Integer> deque2 = new ArrayDeque<>();
	for (int i = 0; i < 10; i++) {
	    deque2.push(i);
	}

	System.out.println(deque2.toString());
	System.out.println(deque2.peek()); // HEAD of deque

	System.out.println(deque2.pop()); // HEAD of deque & Removing the HEAD
	System.out.println(deque2.toString());

    }
}
