package simulado1;

public class AssertTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("aqui primeiro:" + i);
			try {
				assert i%3==0:"cdscds";
				System.out.println(i);
			}catch(AssertionError ae) {
				System.out.println("Odd Number: " + ++i);
			}
			System.out.println(i);
		}
	}
}
