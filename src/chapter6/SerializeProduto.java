package chapter6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializeProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setId(1l);
		produto.setNome("Água Mineral");
		
		// Serialize
		try {
			FileOutputStream fs = new FileOutputStream("Produto1.str");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(produto);
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		// De-serialize
		
		Produto produtoTeste = null; 
		try {
			FileInputStream fi = new FileInputStream("Produto1.str");
			ObjectInputStream oi = new ObjectInputStream(fi);
			produtoTeste = (Produto) oi.readObject();
			
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}catch(Exception e ) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(produtoTeste.toString());
	}
	
}
