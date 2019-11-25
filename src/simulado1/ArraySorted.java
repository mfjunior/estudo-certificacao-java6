package simulado1;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorted {
	public static void main(String[] args) {
		Integer[] numbers = {2,4,7,1,2,4,5};
		Arrays.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(Arrays.toString(numbers));
	}
}
