package jp.co.toanise.syntax.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
	// Data is Unique, no Redundancy
	// Data is unordered in output due to hashing
	HashSet<String> set = new HashSet<String>();
	setPrint(set);

	// Data is Unique, no Redundancy
	// Data is ordered in output due to hashing
	TreeSet<String> treeSet = new TreeSet<String>();
	setPrint(treeSet);
    }

    private static void setPrint(Set<String> set) {
	set.add("John");
	set.add("Ben");
	set.add("Anny");
	set.add("Cody");
	set.add("Duey");
	set.add("John");
	set.add("Ben");
	set.add("Anny");
	set.add("Cody");
	set.add("Duey");

	System.out.println("set is:" + set);
	Iterator<String> iterator = set.iterator();
	while (iterator.hasNext()) {
	    String string = iterator.next();
	    System.out.println(string);
	}
    }
}
