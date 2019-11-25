package gc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IdentaCodigo {

	public static void main(String[] args) {
		try {
			File file = new File("codigo.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String sb = null;
			StringBuilder texto = new StringBuilder();
			while ( (sb=br.readLine())!=null) {
				texto.append(sb);
				texto.append("\n");
				System.out.println(sb);
			}
			System.out.println(texto.toString());
					
			fr.close();
			br.close();

		} catch (IOException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}
}
