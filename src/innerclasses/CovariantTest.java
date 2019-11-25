package innerclasses;

public class CovariantTest {

	public A getObject() {
		return new A();
	}
	
	public static void main(String[] args) {
	/*	CovariantTest covariantTest = new CovariantTest().new SubCovariantTest();
		System.out.println(covariantTest.getObject().x);*/
		CovariantTest covariantTest = new SubClasse();
		System.out.println(covariantTest.getObject().x);
	}
	
	class SubCovariantTest extends CovariantTest {
		public B getObject() {
			return new B();
		}
	}
}
