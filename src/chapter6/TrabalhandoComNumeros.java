package chapter6;

import java.text.NumberFormat;
import java.util.Locale;

public class TrabalhandoComNumeros {
	public static void main(String[] args) {
		float f1 = 123.4539987f;
		Locale locFR = new Locale("fr","FR");
		NumberFormat[] nfa = new NumberFormat[3];
		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFR);
		nfa[2] = NumberFormat.getCurrencyInstance();

		for(NumberFormat nf : nfa) {
			System.out.println("Iterando... " + nf.format(f1));
		}
		
		float f2 = 12322222.45678f;
		Locale locale = new Locale("pt","BR");	
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);		
		System.out.println(nf.format(f2));
		
		
		System.out.println(f2);
				
		nf.setMaximumFractionDigits(4);
		System.out.println(nf.format(f2));
		
	}
}
