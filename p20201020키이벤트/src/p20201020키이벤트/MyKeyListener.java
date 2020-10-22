package p20201020키이벤트;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;

public class MyKeyListener implements KeyListener {

	// 사용자가 글자를 입력했을 경우
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	// 사용자가 키를 눌렀을 경우
	@Override
	public void keyPressed(KeyEvent e) {
		// 눌러진 키 문자를 얻어온다.
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		// 화면에 출력
		System.out.println("keyTyped " + c + " " + keyCode);
	}

	// 사용자가 키에서 손을 떼었을 경우
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
