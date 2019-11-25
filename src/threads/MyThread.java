package threads;

public class MyThread {
	void f() throws MyException {
		throw new MyException();
	}
	
	public static void main(String[] args) throws MyException{
		MyException e1 = null;
		MyThread m = new MyThread();
		
		try {
			m.f();
		}catch(MyException e) {
			e1 = e;
			System.out.println("catch");
		} finally {
			System.out.println("finally");
			throw e1;			
		}
		
		//System.out.println("end");
	}
}


class MyException extends Exception {	
}