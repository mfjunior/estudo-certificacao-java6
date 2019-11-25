package simulado1;

import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipList {
	public static void main(String[] args) {
		ConcurrentSkipListSet<String> mySet = new ConcurrentSkipListSet<String>();
		mySet.add("me");
		mySet.add("you");
		mySet.add("your");
		mySet.add("they");
		mySet.add("she");
		
		NavigableSet<String> mySet1 = mySet.headSet("your");
		
		for(String s: mySet1) {
			System.out.println(s + " ");
		}
		
		
	}
}
