
public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder("a");
		//System.out.println(result.length());
		for(int i=1; i<5; i++) {
			result.append("b");
			System.out.println(result +" - " +result.length());
		}
		//result.insert(5," - 123");
		System.out.println(result);
	}
}
