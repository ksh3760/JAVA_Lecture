package p20201103������;

public class MyThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i);
		}
	}
	
}
