package simulado1;

public class Adiciona {
	static Integer i1,i2=1;
	
	public static void main(String[] args) {
		Integer i3=add();
		System.out.println("i= " + i3.intValue());
	}

	private static Integer add() {
		return i1+i2;
	}
}
