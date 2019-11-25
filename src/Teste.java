
public class Teste {
	public static void main(String[] args) {
/*		double d=5.4;
		int a=0;
		a+=d; // casting automatic		
		System.out.println(a);
*/		Person pessoa = new Person();

		System.out.println(mudaPerson(null));
		
		
	}
	
	static boolean mudaPerson(Person p) {
		if(p instanceof Person) {
			return true;
		}
		return false;
		
	}
}

class Person {
	int a;
	int b;
}
