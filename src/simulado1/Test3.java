package simulado1;

import java.util.concurrent.ConcurrentSkipListSet;

public class Test3 {
	public static void main(String[] args) {
		ConcurrentSkipListSet<String> mySet = new ConcurrentSkipListSet<String>();
		mySet.add("me");
		mySet.add("you");
		mySet.add("they");
		mySet.add("she");
		String newElement = mySet.ceiling("me");
		System.out.println(newElement);
	}
}
