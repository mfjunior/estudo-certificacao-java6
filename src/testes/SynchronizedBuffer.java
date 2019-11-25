package testes;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBuffer implements Buffer{

	private Lock accessLock = new ReentrantLock();
	
	private Condition canWrite = accessLock.newCondition();
	private Condition canRead =  accessLock.newCondition();
	
	private int buffer = -1;
	
	private boolean occupied = false;
	
	public void set(int value) {
		accessLock.lock();
		
		try {
			while( occupied ) {
				System.out.println("Producer tenta escrever.");
				displayState("Buffer full. Producer espera.");
				canWrite.await();
			}
			
			buffer = value;
			
			occupied = true;
			
			displayState("Producer escreve " + buffer);
			
			canRead.signal();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		
		}finally {
			accessLock.unlock();
		}		
	} // fim do método set

	public int get() {
		int readValue = 0 ;
		accessLock.lock();
		
		try {
			while( !occupied ) {
				System.out.println("Consumer tenta ler.");
				displayState("Buffer empty. Consumer espera");
				canRead.await();
			}
			
			occupied = false;
			
			readValue = buffer;
			
			displayState("Consumer lê " + readValue);
			
			canWrite.signal();
		
		}catch( InterruptedException e) {
			e.printStackTrace();
		
		}finally {
			accessLock.unlock();
		}
		
		return readValue;
				
	} // fim do método get
	
	public void displayState(String operation) {
		System.out.printf("%-40s%d\t\t%b\n\n",operation,buffer,occupied);
	}
}
