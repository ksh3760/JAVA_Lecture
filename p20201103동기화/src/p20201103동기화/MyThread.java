package p20201103����ȭ;

public class MyThread extends Thread {
	Counter sharedCounter;
	
	public MyThread(Counter c) {
		sharedCounter = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 20000 ; i++) {
			sharedCounter.increment();
			
			if(i % 40 == 0) {
				sharedCounter.print();
			}
			double d = Math.random();	// 0~1 ������ �Ǽ�
			d = d * 3;					// 0~3 ������ ��
			try {
				sleep((int)d);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sharedCounter.decrement();
		}	
		System.out.print("������ ����");
		sharedCounter.print();
		
	}
	
	

}
