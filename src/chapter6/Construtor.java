package chapter6;

public class Construtor {
	static {
		System.out.println("Testando bloco estático");
	}
	
	{ System.out.println("dscsdcdscdscdssdcdscdsc");}
	
	public Construtor() {
		System.out.println("Testando construtor");
	}
	
	public static void main(String[] args) {
		new Construtor();
		new Construtor();
		new Construtor();
		
	}
}
