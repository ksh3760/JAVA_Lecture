package p20201006Į��;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener {
	
	JButton button;
	Color color = new Color(0,0,0);

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư�� �������� ����Ǵ� �޼ҵ�
		// Color�� ���⼭ ���� �� �ٽ� �г��� �׸����� ��û
		int[] c = new int[3];
		for(int i = 0 ; i < 3 ; i++) {
			c[i] = (int)(Math.random() * 255.0);
		}
		color = new Color(c[0], c[1], c[2]);
		// �ٽ� �г��� �׸����� ��û
		repaint();
	}
	
	// ������
	public MyPanel() {
		// ���̾ƿ�
		setLayout(new BorderLayout());
		// ��ư ����
		button = new JButton("PRESS BUTTON");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
	}
		
	// �׷��ֱ� ���� ������
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.setColor(color);
//		// ä���� �簢���� �׸���.
//		g.fillRect(10, 10, 207, 220);
		
// ���� �׸�-----------------------------------------------------
		g.setColor(color);
		
		//���
		g.drawOval(80,20, 80,80);	//x80y20
		//��
		g.drawOval(100,60, 40,20);	//x100y60
		//�౸��
		g.drawOval(110,65, 7,7);
		g.drawOval(124,65, 7,7);
		//�� ��
		g.fillOval(100,30, 10,10);
		//�� ��
		g.fillOval(130,30, 10,10);
		// �ٵ�
		g.drawLine(120,100,120,150);
		// �ٸ� ��
		g.drawLine(120,150,90,220);
		// �ٸ� ��
		g.drawLine(120,150,150,220);
		// �� ��
		g.drawLine(120,100,90,170);
		// �� ��
		g.drawLine(120,100,150,170);
		// �� �� 
		g.drawOval(85,170, 7,7);
		// �� ��
		g.drawOval(150,170, 7,7);
		//�� ��
		g.drawRect(70,220,20,10);
		//�� ��
		g.drawRect(150,220,20,10);
		//�� ��
		g.drawLine(85,40, 85,15);
		g.drawLine(85,15, 110,20);
		//�� ��
		g.drawLine(155,40, 155,15);
		g.drawLine(155,15, 130,20);
	}


}
