package p20201103µø±‚»≠;

public class Counter {
	private int value = 0;
	
	public synchronized void increment() {
		value++;
	}
	
	public synchronized void decrement() {
		value--;
	}
	
	public void print() {
		System.out.println(value);
	}
	
}
