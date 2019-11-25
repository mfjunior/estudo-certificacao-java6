package chapter6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TrabalhandoComIO {

	// Utilizando FileWriter e FileReader
	public static void main(String[] args) {
/*		try {
			File file = new File("Teste2.txt");
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("cdscsdcscsd");
			pw.flush();
			pw.close();
			
			File myDir = new File("myDir");
			myDir.mkdir();
			File myFile = new File(myDir,"texto.txt");
			FileWriter fw2 = new FileWriter(myFile);
			fw2.write("Testando escrita no arquivo texto.\nTestanto escrita no arquivo texto na linha 2.");
			fw2.flush();
			fw2.close();
			
		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
		try{
			File myDir = new File("myDir");
			File myFile = new File(myDir,"texto.txt");
			FileReader fr = new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);
			
			String s= br.readLine();
			while(s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
			br.close();
			fr.close();
				
		}catch(IOException e) {
			e.getMessage();
			e.printStackTrace();						
		}
	}*/
		
		String[] arquivosDir = new String[100];
		File fd = new File("dirP");
		arquivosDir=fd.list();
		
		for(String s: arquivosDir) {
			System.out.println(s);
		}
		
	}
}
