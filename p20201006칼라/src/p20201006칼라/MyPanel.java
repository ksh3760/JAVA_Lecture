package p20201006칼라;

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
		// 버튼을 눌렀을때 실행되는 메소드
		// Color를 여기서 변경 후 다시 패널을 그리도록 요청
		int[] c = new int[3];
		for(int i = 0 ; i < 3 ; i++) {
			c[i] = (int)(Math.random() * 255.0);
		}
		color = new Color(c[0], c[1], c[2]);
		// 다시 패널을 그리도록 요청
		repaint();
	}
	
	// 생성자
	public MyPanel() {
		// 레이아웃
		setLayout(new BorderLayout());
		// 버튼 생성
		button = new JButton("PRESS BUTTON");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
	}
		
	// 그려주기 위해 재정의
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.setColor(color);
//		// 채워진 사각형을 그린다.
//		g.fillRect(10, 10, 207, 220);
		
// 돼지 그림-----------------------------------------------------
		g.setColor(color);
		
		//헤드
		g.drawOval(80,20, 80,80);	//x80y20
		//코
		g.drawOval(100,60, 40,20);	//x100y60
		//콧구멍
		g.drawOval(110,65, 7,7);
		g.drawOval(124,65, 7,7);
		//눈 좌
		g.fillOval(100,30, 10,10);
		//눈 우
		g.fillOval(130,30, 10,10);
		// 바디
		g.drawLine(120,100,120,150);
		// 다리 좌
		g.drawLine(120,150,90,220);
		// 다리 우
		g.drawLine(120,150,150,220);
		// 팔 좌
		g.drawLine(120,100,90,170);
		// 팔 우
		g.drawLine(120,100,150,170);
		// 손 좌 
		g.drawOval(85,170, 7,7);
		// 손 우
		g.drawOval(150,170, 7,7);
		//발 좌
		g.drawRect(70,220,20,10);
		//발 우
		g.drawRect(150,220,20,10);
		//귀 좌
		g.drawLine(85,40, 85,15);
		g.drawLine(85,15, 110,20);
		//귀 우
		g.drawLine(155,40, 155,15);
		g.drawLine(155,15, 130,20);
	}


}
