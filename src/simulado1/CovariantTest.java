package simulado1;

class A {
	int x=5;
}

class B extends A{
	int x=6;
}

public class CovariantTest {
	public A getObject() {
		return new B();
	}
	
	public static void main(String[] args) {
		CovariantTest c1 = new SubCovariantTest();
		System.out.println(c1.getObject().x);
	}
}

class SubCovariantTest extends CovariantTest {
	public B getObject() {
		return new B();
	}
}
