package jp.co.toanise.syntax.generics;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
	Printer<Integer> intergerPrinter = new Printer<>(23);
	intergerPrinter.print();
	Printer<Double> doublePrinter = new Printer<>(45.56);
	doublePrinter.print();
	Printer<String> stringPrinter = new Printer<>("abc");
	stringPrinter.print();

	ArrayList<Cat> catList = new ArrayList<Cat>();
	catList.add(new Cat());

	AnimalPrinter<Cat> carPrinter = new AnimalPrinter<Cat>(new Cat());
	carPrinter.print();
	AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<Dog>(new Dog());
	dogPrinter.print();

    }
}
