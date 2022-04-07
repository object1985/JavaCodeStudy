package jp.co.toanise.syntax.thread;

/**
 * @author tonaise
 * @see https://www.youtube.com/watch?v=r_MbozD32eo
 *
 */
public class Multithreading {

    public static void main(String[] args) {
	for (int i = 0; i < 3; i++) {
	    MultithreadThing myThing = new MultithreadThing(i);
	    myThing.start();
	}
    }
}
