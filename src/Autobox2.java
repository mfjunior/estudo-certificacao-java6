public class Autobox2 {
	public static void main(String[] args) {
		Float b = 0.9f;
		float a = (float) 0.9;
		System.out.println(b.equals(a));
		System.out.println(a==b);
		// System.out.println(a.equals(A));
		System.out.println(a <= b);
		System.out.println(b <= a);
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//		}

	}}