package simulado1;

public class MyClass {
	static String s1 = "I'm unique";
	
	public static void main(String[] args) {
		String s2 = "I'm unique";
		String s3 =  new String(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s1);
		System.out.println(s3.equals(s1));
	}
}
