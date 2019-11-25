package staticblocks;

public class Derived extends Base{
	
	synchronized static void f() {	
		System.out.println("Método estático da classe Derived");
	}
	
	public static void main(String[] args) {
		Base b = new Derived();
/*		b.f();
		short a =21;
		Derived.f();*/
		met(33);
	}
	
	static void met(short a) {
		System.out.println(a + "short");
	}
	
	static void met(float a) {
		System.out.println(a + "float");
	}
}
