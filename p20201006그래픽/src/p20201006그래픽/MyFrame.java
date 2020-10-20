package p20201006그래픽;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// 생성자에서 처리를 하자.
	public MyFrame(String name) {
		setTitle(name);
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel MyPanel = new MyPanel();
		setVisible(true);
		add(MyPanel);
	}
	
	
}
