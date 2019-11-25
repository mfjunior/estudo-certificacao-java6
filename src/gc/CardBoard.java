package gc;

public class CardBoard {
	Short story = 200;
	String ola= "ola";
	
	CardBoard go(CardBoard teste) {
		teste = null;
		return teste;
	}
	
	public static void main(String[] args) {
		CardBoard c1 = new CardBoard();
		CardBoard c2 = new CardBoard();
		CardBoard c3 = new CardBoard();
		CardBoard c4 = c1.go(c3);
		System.out.println(c3.toString());
		c1=null;		
	}
}
