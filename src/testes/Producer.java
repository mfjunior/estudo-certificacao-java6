package testes;

import java.util.Random;

public class Producer implements Runnable {
       
	private static Random generator = new Random();
	private Buffer sharedLocation;
	
	public Producer(Buffer shared) {
		sharedLocation = shared;
	}
                                                                               
	@Override
	public void run() {
		System.out.println("Iniciando a Thread Producer...");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sharedLocation.set(i);
				sum += i;

				//System.out.printf("\t%2d\n", sum);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Thread Producer Total = " + sum);
		System.out.printf("\n%s\n", "Terminando a Thread Producer.");
	}

}
