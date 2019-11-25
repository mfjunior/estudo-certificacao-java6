import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("teste.txt"));
			scanner.useDelimiter("\n");
			while(scanner.hasNext()) {
				System.out.print(scanner.next());
			}
			scanner.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
}
