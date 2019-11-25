
public class Y extends X {

	public void usaMetodoDaClasseX() {
		System.out.println(usaMaximo(10));
	}
	
	public static void main(String[] args) {
		new Y().usaMetodoDaClasseX();
	}
}
