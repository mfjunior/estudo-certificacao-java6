
public class Tarsier {
	static String s = "-";
	public static void main(String[] args) {
		go();
		System.out.println(s);
		System.gc();
		Runtime.getRuntime().gc();
	}
	
	{go();}
	
	static {go();}
	
	static void go() {
		s+="s";
	}
}
