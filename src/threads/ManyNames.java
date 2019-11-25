package threads;

public class ManyNames {
	public static void main(String[] args) {
		
		NameRunnable nr = new NameRunnable();
		
		Thread t1 = new Thread(nr);
		t1.setName("Fred");
		
		Thread t2 = new Thread(nr);
		t2.setName("Lucy");

		Thread t3 = new Thread(nr);
		t3.setName("Eva");
	
		t1.start();
		t2.start();
		t3.start();
	}
}
