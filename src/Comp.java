import java.util.Arrays;
import java.util.Comparator;

public class Comp {
	public static void main(String[] args) {
		String[] words = { "Good", "Bad", "Ugly","AAA","FFFF","BBBB" };
		Comparator<String> best = new Comparator<String>() {
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};
		Arrays.sort(words, best);

		for (String s : words) {
			System.out.println(s);
		}
	}
}
