package p20201020Ű�̺�Ʈ;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;

public class MyKeyListener implements KeyListener {

	// ����ڰ� ���ڸ� �Է����� ���
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	// ����ڰ� Ű�� ������ ���
	@Override
	public void keyPressed(KeyEvent e) {
		// ������ Ű ���ڸ� ���´�.
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		// ȭ�鿡 ���
		System.out.println("keyTyped " + c + " " + keyCode);
	}

	// ����ڰ� Ű���� ���� ������ ���
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
