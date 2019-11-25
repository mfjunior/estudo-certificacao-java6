import javax.swing.JOptionPane;

public class Exerc7 {
	public static void main(String arg[]) {
		int A[][] = new int[3][2];
		int B[][] = new int[3][2];
		int C[][] = new int[3][2];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite o valor A [" + i + "] " + "[" + j + "] "));
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; i++) {
				String b = JOptionPane.showInputDialog(null,
						"Digite o valor B [" + i + "]");
				B[i][j] = Integer.parseInt(b);
			}
		}
		String saida = "";

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; i++) {
				C[i][j] = A[i][j] + B[i][j];
				saida += "C[" + i + "] =" + C[i] + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, saida);
	}
}
