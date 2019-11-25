package threads;

public class NameRunnable implements Runnable{

	public void run() {
		for(int x=1; x<4; x++ ) {
			System.out.println("Run by " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) { 
				e.printStackTrace();
			}
		}
	}

}
