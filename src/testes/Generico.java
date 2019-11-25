package testes;

import java.util.ArrayList;
import java.util.List;

public class Generico {

	public static void addTeste1(List<? extends Filha> lista) {
		for(Mae a: lista) {
			System.out.println(a);
		}
	}
	
	public static void addTeste2( List<? super Filha> lista ) {
		lista.add(new Filha());
	}
	
	public static void test(Mae m) {
		
	}
	
	public static void main(String[] args) {

		List<? extends Filha> filhaExtends = new ArrayList<Filha>();
		List<? super Filha> filhaSuper = new ArrayList<Filha>();
		
		addTeste1(filhaExtends);
		//addTeste1(filhaSuper);              /* Compilation Fails... */

		
		addTeste2(filhaSuper);		
		//addTeste2(filhaExtends);	     /* Compilation Fails...*/				
		
	}
}
