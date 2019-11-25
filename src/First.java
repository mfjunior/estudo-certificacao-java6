import java.util.Calendar;


public class First {
	public Object method1() {
		System.out.println("Calling super class method.");
		Calendar cal = Calendar.getInstance();
		return new String("Base");
	}
}
