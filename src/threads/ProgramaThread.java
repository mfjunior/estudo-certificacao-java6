package threads;

public class ProgramaThread implements Runnable {
	private int id;
	
	public ProgramaThread(int id) {
		this.id = id;
	}

	
	public void run() {
		for(int i=0; i<1000; i++){
			System.out.println("Programa " + id + " : " + i);
		}
		
	}

}
