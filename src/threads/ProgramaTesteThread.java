package threads;

public class ProgramaTesteThread {

	public static void main(String[] args) {
		ProgramaThread pt1 = new ProgramaThread(1);
		Thread t1 = new Thread(pt1);
		t1.start();
		
		ProgramaThread pt2 = new ProgramaThread(2);
		Thread t2 = new Thread(pt2);
		t2.start();
		
		ProgramaThread pt3 = new ProgramaThread(3);
		Thread t3 = new Thread(pt3);
		t3.start();
		
		ProgramaThread pt4 = new ProgramaThread(4);
		Thread t4 = new Thread(pt4);
		t4.start();
		
		ProgramaThread pt5 = new ProgramaThread(5);
		Thread t5 = new Thread(pt5);
		t5.start();
	}
}
