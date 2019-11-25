package chapter6;

import javax.swing.JOptionPane;

public class Grafo {
	public static void main(String[] args) {
		String tecla = JOptionPane.showInputDialog(null,"Entre com a chave");
		if(!tecla.isEmpty()) {
			JOptionPane.showMessageDialog(null, tecla);			
		}
	}
}
