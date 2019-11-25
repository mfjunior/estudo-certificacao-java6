package diagnostictest;

import java.util.LinkedList;
import java.util.List;

public class Split1 {
	public static void main(String[] args) {
		String[] a = args[0].split(args[1]);
		for(String s: a)
			System.out.println(s);
		
		System.out.println((args[0].split(args[1])).length);
		
		double x = 123.456;
		char c = 65;
		int i = 65;
		
		System.out.println();
		System.out.println();

		System.out.printf("%s",x);System.out.println();
		System.out.printf("%b",x);System.out.println();
		System.out.printf("%c",c);System.out.println();
		System.out.printf("%f",x);System.out.println();
		System.out.printf("%d",i);
		
		metodo(5);
		
		
	}

	public static void metodo(short a) {
		System.out.println("short");
	}
	public static void metodo(float f) {
		System.out.println("float");			
	}

}
