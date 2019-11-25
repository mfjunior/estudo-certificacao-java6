import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ClasseThrows {
	public static void main(String[] args) {
//		int a = 0;
//		int b = 5;
//		try {
//			System.out.println(b/a);
//		}catch(ArithmeticException e) {
//			System.out.print("Atenção!!! Divisão por zero!"); 
//			System.out.println("............." + e.getMessage()); 
//		}
//
//		
//		
//		int c =1;
//		String[] names = {"John", "Merry", "Tom"};
//		names[--c]+="-";
////		for(int i=0; i<names.length; i++) {
////			System.out.println(names[i]);
////		}
////		
//		for (String string : names) {
//			System.out.println(string);
//		}
//		
//		Integer i1 = new Integer("100000");
//		int i2 = 100000;
//		if(i1.equals(i2)) System.out.println("i1 igual a i2");
		
//		Map<String, Integer> myMap = new HashMap<String, Integer>();
//		myMap.put("ab",10);
//		myMap.put("cd",5);
//		myMap.put("ca",30);
//		myMap.put("c",30);
//		myMap.put("az",20);
//		System.out.println("Tamanho da collection: "+myMap.size());
//		
//		for( Integer elemento : myMap.values()) {
//			System.out.println(elemento);
//		}
	
		List<String> listaStrings1 = new ArrayList<String>();
		listaStrings1.add("LISTA 1 - elemento 1");
		listaStrings1.add("LISTA 1 - elemento 2");
		listaStrings1.add("LISTA 1 - elemento 3");
		listaStrings1.add("LISTA 1 - elemento 4");


		List<String> listaStrings2 = new ArrayList<String>();
		listaStrings2.add("LISTA 2 - elemento 1");
		listaStrings2.add("LISTA 2 - elemento 2");
		listaStrings2.add("LISTA 2 - elemento 3");
		listaStrings2.add("LISTA 2 - elemento 4");
		listaStrings2.add("LISTA 2 - elemento 5");
		
		List<String> listaStrings3 = new ArrayList<String>();
		listaStrings3.add("LISTA 3 - elemento 1");
		listaStrings3.add("LISTA 3 - elemento 2");

		Map<String, List<String>> myMap = new HashMap<String, List<String>>();
		myMap.put("Chave da lista 1",listaStrings1);
		myMap.put("Chave da lista 2",listaStrings2);
		myMap.put("Chave da lista 3",listaStrings3);



//		System.out.println("Tamanho da collection: "+myMap.size());
//		System.out.println(myMap.keySet());
//		System.out.println(myMap.values());
		
		for (String key : myMap.keySet()) {
			
			System.out.println(key);
			for (String string : myMap.get(key)) {
				System.out.println(string);
			}
		}
		


	}
}
