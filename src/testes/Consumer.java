package testes;

import java.util.Random;

public class Consumer implements Runnable {
	private Buffer sharedLocation;
	private Random generator = new Random();
	
	public Consumer(Buffer shared) {
		sharedLocation = shared;
	}


	public void run() {
		System.out.println("Iniciando a Thread Consumer...");
		int sum=0;
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sum+=sharedLocation.get();
				//System.out.printf("\t\t\t%2d\n",sum);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread Consumer Total = " + sum);
		System.out.println("Terminando a Thread Consumer.");
	}
	
	
}
