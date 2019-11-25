package gc;

public class Eco {
	Eco e;

	public static void main(String[] args) {
		/*
		 * Eco e1 = new Eco(); Eco e2 = new Eco(); Eco e3 = new Eco(); e3.e =
		 * e2; e1.e = e3; e2 = null; e3 = null; e1 = null;
		 */

		long s = 30l;
		int i = (int) s;
		switch (i) {
		case 30:
			System.out.println("cdscdscd");
			break;
		}
	}
}
