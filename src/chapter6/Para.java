package chapter6;

public class Para {
	int teste;
	String tests;

	public int getTeste() {
		return teste;
	}

	public void setTeste(int teste) {
		this.teste = teste;
	}

	public String getTests() {
		return tests;
	}

	public void setTests(String tests) {
		this.tests = tests;
	}

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("teste");
		StringBuffer buffer2 = new StringBuffer("nada");
		if(buffer.equals(buffer2)) System.out.println("iguais");
		
	}
}
