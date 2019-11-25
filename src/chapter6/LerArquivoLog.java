package chapter6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LerArquivoLog {

	
	public static void main(String[] args) throws IOException {
/*		JFrame frameTexto = new JFrame("Log");
		frameTexto.setSize(700, 500);
		frameTexto.setLocationRelativeTo(null);
				
		JTextArea textArea = new JTextArea();
		textArea.setText(lerArquivo());
		
		JScrollPane areaScrollPane = new JScrollPane(textArea);

		areaScrollPane.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		
		frameTexto.add(areaScrollPane);

		frameTexto.setVisible(true);
*/
		
		lerArquivo();
	}
	
	public static void lerArquivo() throws IOException {
		File file = new File("access_log");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb = new StringBuilder();
		
		while(br.readLine()!=null) {
			sb.append(br.readLine());
			sb.append("\n\n");
		}
		File file2 = new File("log2.txt");
		PrintWriter pw = new PrintWriter(file2);
		
		pw.print(sb.toString());
		pw.close();
		
		System.out.println(sb.toString());;
		br.close();
	}
}
