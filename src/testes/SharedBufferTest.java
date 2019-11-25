package testes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest {
	
	public static void main(String[] args) {
		ExecutorService application = Executors.newFixedThreadPool( 2 );
		
		Buffer sharedLocation = new UnsynchronizedBuffer();
		
		System.out.println("Ação\t\tValor\tProducer\tConsumer");
		System.out.println("----\t\t-------\t--------\t------- \n");
		
		//Thread t1 = new Thread( new Consumer( sharedLocation ) );
		//Thread t2 = new Thread( new Producer( sharedLocation ));
		
		try {
			
			//t1.start();
			//t2.start();
			application.execute( new Consumer( sharedLocation ) );
			application.execute( new Producer( sharedLocation ) );			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
