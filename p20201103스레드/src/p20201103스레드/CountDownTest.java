package p20201103스레드;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {

	private JLabel label;
	
	class MyThread1 extends Thread {
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0 ; i < 100 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				label.setText(100 - i + "");
			}
		}	
	}
	
	CountDownTest() {
		setTitle("홍길동");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		
		(new MyThread1()).start();
		setVisible(true);
	}
	
}
