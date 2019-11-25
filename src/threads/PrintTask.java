package threads;

import java.util.Random;

public class PrintTask implements Runnable {

	private String threadName;
	private int sleepTime;
	private static Random generator = new Random();

	public PrintTask(String name) {
		threadName = name;
		sleepTime = generator.nextInt(5000);
	}


	public void run() {
		try {
			System.out.println("Thread " + threadName + " is sleeping for " +
				sleepTime + ";");
			Thread.sleep(sleepTime);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of Thread " + threadName);
	}
}
