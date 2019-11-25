package testes;

import java.util.*;

public class Test {
	
	public static void main(String args[]) {
		String[] str = {"B", "D", "F", "H", "J"};
		Arrays.sort(str);
		System.out.println("Binary Search for 'A': " + Arrays.binarySearch(str, "A"));
		System.out.println("Binary Search for 'B': " + Arrays.binarySearch(str, "B"));
		System.out.println("Binary Search for 'C': " + Arrays.binarySearch(str, "C"));
		System.out.println("Binary Search for 'D': " + Arrays.binarySearch(str, "D"));
		System.out.println("Binary Search for 'E': " + Arrays.binarySearch(str, "E"));
		System.out.println("Binary Search for 'F': " + Arrays.binarySearch(str, "F"));
		System.out.println("Binary Search for 'G': " + Arrays.binarySearch(str, "G"));
		System.out.println("Binary Search for 'H': " + Arrays.binarySearch(str, "H"));
		System.out.println("Binary Search for 'I': " + Arrays.binarySearch(str, "I"));
		System.out.println("Binary Search for 'J': " + Arrays.binarySearch(str, "J"));
		System.out.println("Binary Search for 'K': " + Arrays.binarySearch(str, "K"));		
		System.out.println("Binary Search for 'L': " + Arrays.binarySearch(str, "L"));				
	}
}

