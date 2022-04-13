package jp.co.toanise.syntax.methodreferences;

interface Calculator {
    void add(int num1, int num2);
}

class Calc {
    public static void addSomething(int num1, int num2) {
	System.out.println(num1 + " and " + num2 + " addition is: " + (num1 + num2));
    }

    public void letsAdd(int num1, int num2) {
	System.out.println(num1 + " and " + num2 + " adds to: " + (num1 + num2));
    }
}

interface Messager {
    Message getMessage(String msg);
}

class Message {
    public Message(String msg) {
	System.out.println(">> Message is :" + msg);
    }
}

public class MethodReferencesApp {

    public static void main(String[] args) {
	// Calc.addSomething(10,20)

	// 1.Referring to a Static Method
	Calculator cRef = Calc::addSomething; // Method Reference
	cRef.add(1, 2);

	// 2.Reference to a non static method or Instance Method
	// Object Construction Statement for Calc
	Calc calc = new Calc();
	Calculator cRef2 = calc::letsAdd; // Method Referense
	cRef2.add(12, 23);

	// 3.Reference to a Constructor
	Messager mRef = Message::new; // Method Referense
	mRef.getMessage("Search the candle rather than cursing the darkness!");
    }

}
