package simulado1;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public class MyThread extends Thread{
	public void run() {
		m1();
	}
	
	MyThread(String threadName) {
		super(threadName);
	}
	
	public synchronized void m1() {
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		b.start();
		Thread.yield();
		a.run(); // não inicia uma Thread nova diretamente, apenas irá rodas o método, mas levando em conta a Thread atual (main)
		TreeSet treeSet = new TreeSet();
		treeSet.add(3);
		treeSet.add(6);
		treeSet.add(7);
		
		System.out.println(treeSet.higher(3));
		
		File file = new File("cdscds");
		ArrayList<String> lista = new ArrayList<String>();
		//lista.toArray(s);
		
	}
	
	static void f(int... a) {
	}
}
