package diagnostictest;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test2 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("ee");
		hashSet.add("ft");
		hashSet.add("lq");
		hashSet.add("ab");
		TreeSet<String> treeSet = new TreeSet<String>(hashSet);
		
		for(String s: treeSet) {
			System.out.println(s + " ");
		}
		
	}
}
