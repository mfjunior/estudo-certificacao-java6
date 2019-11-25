package testes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest2 {

	public static void main(String[] args) {
		ExecutorService application = Executors.newFixedThreadPool(2);

		Buffer sharedLocation = new SynchronizedBuffer();

		System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n","Operation", "Buffer",
				"Occupied", "--------","------\t\t--------");

		try {

			application.execute(new Consumer(sharedLocation));
			application.execute(new Producer(sharedLocation));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
