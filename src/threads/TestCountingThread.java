package threads;

public class TestCountingThread {
	public static void main(String[] args) {		
		new Thread(new CountingThread()).start();
		new Thread(new CountingThread()).start();
		new Thread(new CountingThread()).start();
		new Thread(new CountingThread()).start();
		
	}
}
