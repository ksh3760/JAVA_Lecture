package p20201006Ä®¶ó;

import javax.swing.JFrame;

public class ColorTestFrame extends JFrame {

	public ColorTestFrame(String name) {
		setSize(240, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(name);
		setVisible(true);
		MyPanel panel = new MyPanel();
		add(panel);
	}

}
