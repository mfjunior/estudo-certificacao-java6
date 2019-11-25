import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serial implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4201489231141335588L;
	String a;
	String b;
}

public class Divisao {

	public void montaFracao(int numerador, int denominador) {
		int i = 1;

		do {

			if (i > 1) {
				while (numerador % i == 0 && denominador % i == 0) {
					numerador = numerador / i;
					denominador = denominador / i;
					System.out.println(numerador + "/" + denominador);
				}
			} else {
				System.out.println(numerador + "/" + denominador);
			}
			i++;
		}
		while ((numerador % i == 0 && denominador % i == 0)
				|| (numerador > 1 && denominador > 1 && i <= numerador));
/*		while ((numerador % i == 0 && denominador % i == 0)
				|| (numerador > 1 && denominador > 1 && i <= numerador)) {

			if (i > 1) {
				while (numerador % i == 0 && denominador % i == 0) {
					numerador = numerador / i;
					denominador = denominador / i;
					System.out.println(numerador + "/" + denominador);
				}
			} else {
				System.out.println(numerador + "/" + denominador);
			}
			i++;
		}*/
		//System.out.println(i);
		// System.out.println(--i);
	}

	public static void main(String[] args) throws IOException {
		new Divisao().montaFracao(70, 2);

//		Serial s = new Serial();
//		FileOutputStream fos = new FileOutputStream("fds.ser");
//		ObjectOutputStream os = new ObjectOutputStream(fos);
//		os.writeObject(s);
//		fos.close();
//		os.close();

	}
}
