package simulado1;

class A1 {}
class B1 extends A1{}
class C1 extends A1{}

public class TestInheritance {

	public static void main(String... args) {
		A1 x = new A1();
		B1 y = new B1();
		C1 z = new C1();
		//x = y;				// OK
		//z = x;			// Compilation Error
		//y = (B1) x;       // Runtime error
		//z = (C1) y;       // Compilation Error
		//y = (A)y;			// Compilation Error
	}
}
