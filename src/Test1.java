import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("gh");
		hashSet.add("ab");
		hashSet.add("A");
		hashSet.add("X");

		TreeSet<String> treeSet = new TreeSet<String>(hashSet);
		ArrayList converteSetParaList = new ArrayList(treeSet);
		for(Object o: converteSetParaList) {
			System.out.println(o);
		}
	}

}
