import java.util.Locale;

public class TestTreeMap {
	public static void main(String[] args) {
		/*
		 * TreeMap myMap = new TreeMap(); myMap.put("a",1); myMap.put("b",2);
		 * myMap.put("c",3); myMap.put("d",4);
		 * 
		 * NavigableMap myMap2 = myMap.headMap("d", true); // retorna um mapa
		 * cujos valores de key sejam menores que o fornecido, qualquer mudança
		 * em myMap2 reflete no mapa original desde que obedecido a chave de
		 * entrada myMap.put("zz", "cds"); myMap.put("ff", "cdscds");
		 * myMap2.put("bs", 2); System.out.println(myMap.size() + " " +
		 * myMap2.size());
		 */

		/*
		 * Integer i = new Integer(5); Integer j = new Integer(5);
		 * if(i.intValue()==j.intValue()) { System.out.println("iguais"); }
		 */

		Locale[] locais = Locale.getAvailableLocales();
		for (Locale l : locais) {
			System.out.println(l.toString());
		}
	}
}
