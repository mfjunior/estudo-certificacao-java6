import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;

public class SaidaPadrao{
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt", true);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.newLine();
		bw.write("testando arquivo");
		bw.close();
	}
	private String nome;
	private int idade;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
