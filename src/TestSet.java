import java.util.Collection;
import java.util.TreeSet;


public class TestSet {
	public static void main(String[] args) {
		Collection<String> set = new TreeSet<String>();
		set.add("Java");
		set.add("XML");
		set.add("xmd");
		set.add("amarelo");
		set.add("Amarelo");
		set.add("branco");
		set.add("Swing");
		set.add("JSP");
		set.add("Java");
		
		for(Object o:set) {
			System.out.println(o + " ");
		}
		
	}
}
