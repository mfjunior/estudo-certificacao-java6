package threads;

public class CountingThread implements Runnable {


	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.print("Número: " + i);
			if(i%10==0)	System.out.print("  (*) Múltiplo de 10 " );		
			System.out.println();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
