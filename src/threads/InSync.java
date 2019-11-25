package threads;

public class InSync extends Thread {

	private StringBuffer letter;
	
	public InSync(StringBuffer letter) {
		this.letter = letter;
	}
	
	@Override
	public void run() {
		synchronized(this) {
			for (int i = 1; i <=70; i++) {
				System.out.println(letter);
			}
			System.out.println();
			char temp = letter.charAt(0);
			++temp;
			letter.setCharAt(0,temp);
		}
	}
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		new InSync(sb).start();
		new InSync(sb).start();
		new InSync(sb).start();
		
	}
	
}
