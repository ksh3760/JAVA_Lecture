package p20200929그리드;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 3개의 열을 가진 GridLayout, 행의 개수는 추가되는 컴포넌트에 의해 결정된다.
		setLayout(new GridLayout(0, 3));	// 3개의 열과 필요한 만큼의 행
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));
		
		pack();
		setVisible(true);
		
	}
	
}
