package p20201103������;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(100-i);
		}
	}

}
