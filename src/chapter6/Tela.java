package chapter6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Tela {
	public static void main(String[] args) {

		JFrame telaPrincipal = new JFrame("Teste Tela");
		telaPrincipal.setSize(800, 600);
		telaPrincipal.setLocationRelativeTo(null);
		
		// Paineis que contem outros paineis
		JPanel painelCentral = new JPanel(new BorderLayout());    // painel central -> container de todos os outros paineis
		JPanel painelInferior = new JPanel(new FlowLayout());     // painel central -> container dos dois paineis inferiores

		// Barra de menus
		JMenuBar mb = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenu menuHelp = new JMenu("Help");
		mb.add(menuFile);
		mb.add(menuHelp);
		
		painelCentral.add(mb,BorderLayout.NORTH);   // adicionando a barra de menus 
		
		// Painel Imagem		
		TitledBorder tituloImagem;   // titulo do painel       
		tituloImagem = BorderFactory.createTitledBorder("Imagem"); // cria borda com titulo

		JPanel painelImagem = new JPanel();
		//painelImagem.setPreferredSize(new Dimension(200, 200));
		painelImagem.setBorder(tituloImagem);
		
		painelCentral.add(painelImagem,BorderLayout.CENTER);
		
		// Painel Inferior - Que ira conter os outros dois (para facilitar momentaneamente, pesquise outra forma de fazer...)
		painelCentral.add(painelInferior,BorderLayout.SOUTH);
		
		// Painel Informacoes		
		TitledBorder tituloInf;       
		tituloInf = BorderFactory.createTitledBorder("Informações");
		
		JPanel painelInformacoes = new JPanel();
		painelInformacoes.setPreferredSize(new Dimension(300, 200));
		painelInformacoes.setBorder(tituloInf);
		
		painelInferior.add(painelInformacoes);
		
		// Painel Observações		
		TitledBorder tituloObs;       
		tituloObs = BorderFactory.createTitledBorder("Observações");

		JPanel painelObservacoes = new JPanel();
		painelObservacoes.setPreferredSize(new Dimension(300, 200));
		painelObservacoes.setBorder(tituloObs);		

		painelInferior.add(painelObservacoes);
						
		telaPrincipal.add(painelCentral);		
		telaPrincipal.setVisible(true);		
	}
}
