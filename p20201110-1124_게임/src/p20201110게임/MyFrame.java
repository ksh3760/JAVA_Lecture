package p20201110게임;

import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements WindowListener {
	MyPanel panel;
	
	MyFrame() {
		setTitle("게임타이틀");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new MyPanel();
		add(panel);
		setVisible(true);
		addWindowListener(this);
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mX" + panel.mX + " , mY : " + panel.mY);
		// 바이너리 파일을 생성해서 값을 저장해보자.
		FileOutputStream out = null;
		// 새로운 파일 생성
		try {
			out = new FileOutputStream("a.bin");
			
			// 파일에 데이터를 보낸다.
			out.write(panel.mX);
			out.write(panel.mY);
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
			}
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
