package diagnostictest;

public class RecurThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + i);
			start();
		}
	}

	public static void main(String[] args) {
		RecurThread t1 = new RecurThread();
		t1.setName("TA");
		t1.start();
		RecurThread t2 = new RecurThread();
		t2.setName("TB");
		t2.start();
	}

}
