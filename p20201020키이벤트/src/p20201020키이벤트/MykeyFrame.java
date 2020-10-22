package p20201020키이벤트;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MykeyFrame extends JFrame {
	public MykeyFrame(String name) {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(name);
		
		// 텍스트필드 컴포넌트 생성
		JTextField tf = new JTextField(20);
		// 리스너 객체 생성
		MyKeyListener listener = new MyKeyListener();
		// 텍스트필드 컴포넌트 이벤트 객체 등록
		tf.addKeyListener(listener);
		// 텍스트필드 컴포넌트를 프레임에 추가
		add(tf);
		this.setVisible(true);
	}
}
