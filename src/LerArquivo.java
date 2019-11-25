import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {
	public static void main(String[] args) throws IOException {

		/*		Usando InputStream
 
  		InputStream input = new FileInputStream("texto.txt");
		InputStreamReader inputReader = new InputStreamReader(input);
		BufferedReader reader = new BufferedReader(inputReader);
		
		ou
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("texto.txt")));
		*/
		
		/*		Usando FileReader */
		
		FileReader fr = new FileReader("texto.txt");
		BufferedReader reader = new BufferedReader(fr);
		
		String leitura = reader.readLine();
		
		while (leitura != null) {
			System.out.println(leitura);
			leitura = reader.readLine();
		}

		
		reader.close();
	}
}
