package threads;

import java.util.Collection;
import java.util.HashSet;

public class BancoDeDados {
	public static void main(String[] args) throws InterruptedException {
		Collection<String> sqls = new HashSet<String>();

		Thread t1 = new Thread(new ProduzSQL(0, 1000, sqls));
		Thread t2 = new Thread(new ProduzSQL(1000, 2000, sqls));
		Thread t3 = new Thread(new ProduzSQL(2000, 3000, sqls));

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();

		for (String s : sqls) {
			System.out.println(s);
		}

	}
}
