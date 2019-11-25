package diagnostictest;

class First {
	public Object method1() {
		System.out.println("Calling superclass method");
		return new String("Base");
	}
}

class Second extends First {
	
	@Override
	public String method1() {
		System.out.println("Calling subclass method");
		return new String("Derived");
	}
}

public class Question2 {
	public static void main(String[] args) {
		System.out.println("Calling superclass method");
		First o = new Second();
		//String s = o.method1();    // erro de compilacao, não é possível atribuir um Object a uma String
		String s = (String) o.method1();    // correto
		
	}
}
