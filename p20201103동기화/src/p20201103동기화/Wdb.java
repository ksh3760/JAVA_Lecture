package p20201103����ȭ;

public class Wdb {

	public static void main(String[] args) {
		// �����ڿ� Counter
		Counter c = new Counter();
		
		Thread t1 = new MyThread(c);
		t1.start();
		
		Thread t2 = new MyThread(c);
		t2.start();
		
	}

}
