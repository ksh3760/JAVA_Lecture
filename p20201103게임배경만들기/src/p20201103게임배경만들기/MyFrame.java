package p20201103���ӹ�游���;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("���ӹ��");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		add(panel);
		setVisible(true);
	};
	
}
