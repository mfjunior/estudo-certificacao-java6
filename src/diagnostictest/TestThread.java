package diagnostictest;

import java.text.DateFormat;

public class TestThread extends Thread {
	public void restart() {
		startMe();
	}

	public  static void startMe() {
		synchronized(TestThread.class) {
			TestThread.class.notifyAll();
			System.out.println("Trying to notify");
		}		
	}
	
	public void run() {
		try {

				wait();
				System.out.println("Notified");

		}catch(InterruptedException e) {	
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
/*		TestThread t1 = new TestThread();
		t1.start();
		t1.restart();*/
		DateFormat df;
	}
}
