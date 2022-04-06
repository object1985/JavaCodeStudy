package jp.co.toanise.syntax.lambda;

interface Cab { // When an interface will have exactly 1 abstract method we can say it as a Functional Interface
    void bookCab(); // -> by default public abstract void bokCab()
}

interface Cab2 { // When an interface will have exactly 1 abstract method we can say it as a Functional Interface
    void bookCab(String source, String destinition); // -> by default public abstract void bokCab()
}

interface Cab3 { // When an interface will have exactly 1 abstract method we can say it as a Functional Interface
    double bookCab(String source, String destinition); // -> by default public abstract void bokCab()
}

class UberX implements Cab {

    @Override
    public void bookCab() {
	System.out.println("UberX Booked!! Arriving Soon!!");
    }
}

/**
 * @author tonaise
 * @see https://www.youtube.com/watch?v=VLTEPWkEhsg
 *
 */
public class LambdaApp {

    static int sVar = 199;

    public static void main(String[] args) {
	// 1. statment
	Cab cab = new UberX(); // Polymorphic Statement
	cab.bookCab();

	// 2. statment
	Cab cab2 = new Cab() { // Annonymous Class Implementation
	    @Override
	    public void bookCab() {
		System.out.println("UberX Booked2!! Arriving Soon!!");
	    }
	};
	cab2.bookCab();

	// 3. statment
	// Using a Lambda Expression -> Functional Interface
	Cab cab3 = () -> {
	    System.out.println("UberX Booked3!! Arriving Soon!!");
	};
	cab3.bookCab();

	Cab2 cab2_1 = (source, destinition) -> {
	    System.out.println("UberX Booked3!! from:" + source + " ,Arriving Soon!!to:" + destinition);
	};
	cab2_1.bookCab("barbacu", "2km");

	Cab3 cab3_1 = (source, destinition) -> {
	    System.out.println("UberX Booked3!! from:" + source + " ,Arriving Soon!!to:" + destinition);
	    return 888;
	};
	double fare = cab3_1.bookCab("Bengaluru", "Coorg");
	System.out.println("fare shall be :" + fare);
    }

}
