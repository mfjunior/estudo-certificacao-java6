package chapter6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SuperNotSerial {
	public static void main(String[] args) {
		Dog d = new Dog(35, "Fido");
		System.out.println("before: " + d.name + " " + d.weight);
		
		// serializando
		try {		
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();			
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		// desserializando
		try {
			FileInputStream fi = new FileInputStream("testSer.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);
			d = (Dog)oi.readObject();
			oi.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("after: " + d.name + " " + d.weight);
	}
}
