package comparacoes;

import java.util.Arrays;
import java.util.Comparator;

public class SearchObjArray {

	public static void main(String[] args) {
		String[] sa = {"one", "two", "three", "four"};
		
		Arrays.sort(sa);
		
		for(String s: sa) {
			System.out.print( s + " ");
		}
		
		System.out.println("\none = " + Arrays.binarySearch(sa, "one"));
		
		System.out.println("\nAgora com a ordem reversa\n");
		
		ReSortComparator rs = new ReSortComparator();
		Arrays.sort(sa,rs);
		
		for(String s: sa)
			System.out.println(s + " ");
		
		System.out.println("\n one = " + Arrays.binarySearch(sa, "one"));
		
		System.out.println("\n one = " + Arrays.binarySearch(sa, "one",rs));		
		
	}
	
	static class ReSortComparator implements Comparator<String> {
		@Override		
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);  // ordem reversa
		}
		
	}
}
