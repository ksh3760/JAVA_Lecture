package p20201006�׷���;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// �����ڿ��� ó���� ����.
	public MyFrame(String name) {
		setTitle(name);
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel MyPanel = new MyPanel();
		setVisible(true);
		add(MyPanel);
	}
	
	
}
