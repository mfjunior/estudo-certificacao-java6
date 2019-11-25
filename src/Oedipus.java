
class Father { 
	protected Father() {
		System.out.println("Create a father");
	}
}

public class Oedipus extends Father{
	public Oedipus() {
		System.out.println("Well, that's alright then!");
	}
	
	public static void main(String[] args) {
		new Oedipus();
	}
}
