package jp.co.toanise.syntax.thread;

public class MultithreadThing extends Thread {

    private int threadNumber;

    public MultithreadThing(int threadNumber) {
	this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
	for (int i = 0; i < 5; i++) {
	    System.out.println(this.getId() + ":" + i);
	    try {
		Thread.sleep(1000);
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
    }

}
