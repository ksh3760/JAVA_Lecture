package p20201103스레드;

public class Wdb {

	public static void main(String[] args) {
		// Thread 클래스를 상속하여 Thread 클래스를 구현하는 방법
//		Thread t1 = new MyThread();
//		Thread t2 = new MyThread();
//		t1.start();
//		t2.start();

		// Runnable 인터페이스를 상속하여 Thread 클래스를 구현하는 방법
//		Thread t1 = new Thread(new MyRunnable());
//		t1.start();
		
		CountDownTest t = new CountDownTest();
	
	}

}
