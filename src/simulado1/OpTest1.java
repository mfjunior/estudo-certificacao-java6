package simulado1;

public class OpTest1 {
	public static void main(String[] args) {
		int a = -5;
		int b = -2;
		a %= b;
		b = a > 0 ? 0 : a;
		System.out.println(a + " " + b);
	}
}
