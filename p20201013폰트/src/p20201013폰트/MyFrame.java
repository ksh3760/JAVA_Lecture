package p20201013폰트;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// 생성자
	public MyFrame() {
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("엄준식");
		MyPanel myPanel = new MyPanel();
		add(myPanel);
		setVisible(true);
	}
}
