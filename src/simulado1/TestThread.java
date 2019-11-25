package simulado1;

public class TestThread extends Thread{
	private int i;
	static String s = new String("hi");
	
	TestThread(String s) {
		super(s);
	}
	
	public synchronized String getObj() {
		return s;
	}
	
	public void run() {
		try {
			synchronized (s) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			}
		}catch(InterruptedException e) {}
	}
	
	public static void main(String[] args) {
		TestThread t1 = new TestThread("A");
		TestThread t2 = new TestThread("B");
		t1.start();
		t2.start();
	} 
	
}
