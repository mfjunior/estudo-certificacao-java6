import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class LerEntradaPadrao {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		String s = br.readLine(); // le entrada do teclado
		//System.out.println(s);
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
			if(s.equals("exit")) {
				br.close();
				System.exit(0);
			}
		}

	}
}
