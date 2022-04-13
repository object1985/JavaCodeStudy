package jp.co.toanise.syntax.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author tonaise
 * @see https://www.youtube.com/watch?v=5dscMs2hnDI
 *
 */
public class LinkedListExample {

    private static long startTime = 0;
    private static long endTime = 0;

    public static void main(String[] args) {
	// LinkedList.
	// slow access to specify element
	// fast add/remove element
	LinkedList<String> namesLinkedList = new LinkedList<>();
	namesLinkedList.add("John");
	namesLinkedList.add("Paul");
	namesLinkedList.add("Gerge");
	namesLinkedList.add("ingo");

	startTime = System.currentTimeMillis();
	for (int i = 0; i < 100000; i++) {
	    namesLinkedList.add("Numer" + i);
	}
	endTime = System.currentTimeMillis();
	printProc("LinkedList add");

	startTime = System.currentTimeMillis();
	for (int i = 0; i < 1000; i++) {
	    namesLinkedList.get(49999);
	}
	endTime = System.currentTimeMillis();
	printProc("LinkedList get");

	startTime = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++) {
	    namesLinkedList.add(namesLinkedList.size() / 2, "Ben" + i);
	}
	endTime = System.currentTimeMillis();
	printProc("LinkedList add by specify index");

	startTime = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++) {
	    namesLinkedList.remove();
	}
	endTime = System.currentTimeMillis();
	printProc("LinkedList remove the head element");

	// ArrayList.
	// fast access to specify element
	// slow add/remove element
	ArrayList<String> namesArrayList = new ArrayList<>();
	namesArrayList.add("John");
	namesArrayList.add("Paul");
	namesArrayList.add("Gerge");
	namesArrayList.add("ingo");

	startTime = System.currentTimeMillis();
	for (int i = 0; i < 100000; i++) {
	    namesArrayList.add("Numer" + i);
	}
	endTime = System.currentTimeMillis();
	printProc("ArrayList add");

	startTime = System.currentTimeMillis();
	for (int i = 0; i < 1000; i++) {
	    namesArrayList.get(49999);
	}
	endTime = System.currentTimeMillis();
	printProc("ArrayList get");

	startTime = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++) {
	    namesArrayList.add(namesArrayList.size() / 2, "Ben" + i);
	}
	endTime = System.currentTimeMillis();
	printProc("ArrayList add by specify index");

	startTime = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++) {
	    namesArrayList.remove(1);
	}
	endTime = System.currentTimeMillis();
	printProc("ArrayList remove the head element");

    }

    private static void printProc(String message) {
	System.out.println(message + "ˆ—ŽžŠÔ F " + (endTime - startTime) + "ƒ~ƒŠ•b");
    }

}
