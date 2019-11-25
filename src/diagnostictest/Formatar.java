package diagnostictest;

import java.util.Formatter;
import java.util.Locale;

public class Formatar {
	public static void main(String[] args) {
		String s = new String();
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb,Locale.US);
		
		formatter.format("PI=%2.10f", Math.PI);
		
		s = String.format("His name is %1s %2s", "Thomas", "Edison");
		
		System.out.println(s);
		
		System.out.println(sb);
		
		
	}
}
