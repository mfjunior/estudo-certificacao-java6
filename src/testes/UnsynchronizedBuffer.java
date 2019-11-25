package testes;

public class UnsynchronizedBuffer implements Buffer {

	private int buffer = -1;
	@Override
	public int get() {
		System.out.printf("Consumer lê:\t%2d",buffer);
		return buffer;
	}

	@Override
	public void set(int value) {
		System.out.printf("Producer escreve:\t%2d",value);
		buffer = value;
	}

}
 