package p20201013��Ʈ;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	//��� ����
	Font f1, f2, f3, f4, f5;
	Font f6;
	
	//������
	public MyPanel() {
		f1 = new Font("serif", Font.PLAIN, 20);
		f2 = new Font("san Serif", Font.BOLD, 20);
		f3 = new Font("Monospaced", Font.ITALIC, 20);
		f4 = new Font("Dialog", Font.BOLD, 20);
		f5 = new Font("DialoaInput", Font.BOLD, 20);
		f6 = new Font("�޸ո���", Font.PLAIN, 40);
	}
	
	//�������̵� ) �ҽ� -> �������̵�/���÷���Ʈ �޼ҵ� -> jcomponent -> paintComponent ����
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(f1);
		g.drawString("Serif ��Ʈ 20 point PLANE", 10, 50);

		g.setFont(f2);
		g.drawString("san Serif ��Ʈ 20 point BOLD", 10, 80);
		
		g.setFont(f3);
		g.drawString("Monospaceed ��Ʈ 20 point ITALIC", 10, 100);
		
		g.setFont(f4);
		g.drawString("Dialog ��Ʈ 20 point BOLD + ITALIC", 10, 140);
		
		g.setFont(f5);
		g.drawString("�޸ո��� ��Ʈ 20 point BOLD", 10, 170);
		
		
	}
	
	
}
