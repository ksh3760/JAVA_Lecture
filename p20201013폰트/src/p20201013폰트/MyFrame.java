package p20201013��Ʈ;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// ������
	public MyFrame() {
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���ؽ�");
		MyPanel myPanel = new MyPanel();
		add(myPanel);
		setVisible(true);
	}
}
