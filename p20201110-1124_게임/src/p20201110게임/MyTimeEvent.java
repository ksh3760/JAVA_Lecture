package p20201110∞‘¿”;

import java.util.TimerTask;

public class MyTimeEvent extends TimerTask {
	static int count = 0;
	MyPanel mPanel;

	public MyTimeEvent(MyPanel myPanel) {
		mPanel = myPanel;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(count++);
		mPanel.autoPlay();
	}

}
