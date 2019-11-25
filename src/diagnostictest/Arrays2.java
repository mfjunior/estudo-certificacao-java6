package diagnostictest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arrays2 {
	public static void main(String[] args) {
		String[] str = {"apple", "mango", "orange", "mango" };
		Set<String> set = new HashSet<String>(Arrays.asList(str));
		set.add("banana");
		set.add("mango");
		set.add("banana");
		set.add("mango");
		set.add("banana");
		set.add("mango");
		
		for(String s: str) {
			System.out.println(s);
		}
		
		System.out.println(set.size());
	}
}
