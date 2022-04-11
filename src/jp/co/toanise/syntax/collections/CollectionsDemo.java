package jp.co.toanise.syntax.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsDemo {
//ƒCƒ“ƒ^ƒtƒFƒCƒX    List      List      Map     Map     Set     Set
//        ArrayList LinkedList HashMap TreeMap HashSet TreeSet
//==================================================================
//element duplicate  ›         ›        ~       ~       ~       ~
//null allow         ›         ›        ›       ~       ›       ~
//AutoSort           ~         ~        ~       ›       ~       ›

    public static void main(String[] args) {

	// List
	ArrayList<String> list1 = new ArrayList<String>();

	list1.add("John");
	list1.add("Mow");
	list1.add("Ben");

	for (String string : list1) {
	    System.out.println("ArrayList<String>:" + string);
	}

	Iterator<String> iterator = list1.iterator();
	while (iterator.hasNext()) {
	    System.out.println("Iterator<String>:" + iterator.next());
	}

	String[] stringArray = new String[list1.size()];
	list1.toArray(stringArray);
	for (int i = 0; i < stringArray.length; i++) {
	    String string = stringArray[i];
	    System.out.println("stringArray[i]:" + string);
	}

	List<String> asList = Arrays.asList(stringArray);
	for (int i = 0; i < asList.size(); i++) {
	    System.out.println("asList.get(i):" + asList.get(i));
	}
//	asList.add("UnsupportedOperationException");	//not allow new element.
	List<String> newList = new ArrayList<String>(asList);
	newList.add("No_UnsupportedOperationException"); // not allow new element.
	System.out.println(newList.toString());

	// Map
	// key => value
	// not allow duplicate
	// Tree is sorted
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	for (int i = 0; i < 5; i++) {
	    hashMap.put(i, "hashValue" + i);
	}
	hashMap.put(0, "hashValue0Updated");
	printMap(hashMap);

	TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
	for (int i = 0; i < 5; i++) {
	    treeMap.put(i, "treeValue" + i);
	}
	treeMap.put(0, "treeValue0Updated");
	printMap(treeMap);

	// Set
	// no index management like list, no key management like map.
	// not allow duplicate
	// Tree is sorted
	Random random = new Random();
	HashSet<Integer> hashSet = new HashSet<>();
	for (int i = 0; i < 5; i++) {
	    hashSet.add(random.nextInt(9999));
	}
	hashSet.add(1);
	hashSet.add(1);
	for (Integer value : hashSet) {
	    System.out.println("hashSet:" + value);
	}
	TreeSet<Integer> treeSet = new TreeSet<>();
	for (int i = 0; i < 5; i++) {
	    treeSet.add(random.nextInt(9999));
	}
	treeSet.add(1);
	treeSet.add(1);
	for (Integer value : treeSet) {
	    System.out.println("treeSet:" + value);
	}

    }

    private static void printMap(Map<Integer, String> map) {
	for (Integer key : map.keySet()) {
	    System.out.println("key:" + key + ",value:" + map.get(key));
	}
	for (String value : map.values()) {
	    System.out.println(value);
	}
    }
}
