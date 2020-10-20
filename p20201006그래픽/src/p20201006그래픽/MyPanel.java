package p20201006그래픽;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	static int a = 1;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
//		g.drawString("코로나를 이깁시다 웹데이터베이스 전공 여러분" + a++, 10, 10); // 좌표 x, y		
		g.drawString("코로나를 이깁시다 웹데이터베이스 전공 여러분" + a++, 200, 10);
//		// 라인 그리기
//		g.drawLine(10, 20, 500, 20);
//		// 사각형 그리기
//		g.drawRect(10, 30, 100, 100);	// x,y height, width
		
		// 색상
//		g.setColor(Color.YELLOW);
		
//		// 폴리라인
//		int[] x1 = {10, 20, 30, 40, 50, 60, 70, 80};
//		int[] y1 = {10, 20, 10, 20, 10, 20, 10, 20};
//		g.drawPolyline(x1, y1, 8);
//		
//		// 채워진 사각형
//		g.fillRect(200, 30, 100, 100);
//		
//		// 타원형
//		g.drawOval(350, 30, 100, 100);
//		
//		// 호
//		g.drawArc(550, 30, 150, 100, 225, 90);
//		g.fillArc(550, 30, 150, 100, 225, 90);
//		
//		// 방사능
//		g.fillArc(550, 30, 150, 100, 100, 90);
//		g.fillArc(550, 30, 150, 100, 350, 90);
		
		// 얼굴
//		g.setColor(Color.BLACK);
//		g.fillOval(17, 28, 205, 205);
//		g.setColor(Color.YELLOW);
//		g.fillOval(20, 30, 200, 200);
//		g.setColor(Color.BLACK);
//		g.drawArc(60, 80, 50, 50, 180, -180);
//		g.drawArc(150, 80, 50, 50, 180, -180);
//		//입
//		g.drawArc(100, 120, 50, 50, -180, 180);
//		//볼4
//		g.setColor(Color.RED);
//		g.fillOval(35, 120, 30, 30);
//		g.fillOval(170, 120, 30, 30);
		
//		// ^오^
//		g.setColor(Color.YELLOW);
//		g.fillOval(20, 30, 200, 200);
//
//		
//		//좌 눈
//		g.setColor(Color.BLACK);
//		g.drawLine(55,110, 80,90);
//		g.drawLine(80,90, 100,110);
//		
//		//우 눈

//		
//		//코
//		g.drawOval(110,110, 20,20);
//		g.drawLine(122,130, 122, 170);
//		
//		//입
//		g.drawLine(100,170, 150, 170);
		
		
		
	}
	
//	protected void PaintComponent(Graphics g) {
//		super.paintComponent(g);
//		g.drawString("코로나를 이깁시다 웹데이터베이스 전공 여러분" + a++, 200, 10);
//		// 라인 그리기
//		g.drawLine(10, 20, 500, 20);
//		// 사각형 그리기
//		g.drawRect(10, 30, 100, 100);	// x,y height, width
//		
//		// 폴리라인
//		int[] x1 = {10, 20, 30, 40, 50, 60, 70, 80};
//		int[] y1 = {10, 20, 10, 20, 10, 20, 10, 20};
//		g.drawPolyline(x1, y1, 8);
//		
//		// 채워진 사각형
//		g.fillRect(200, 30, 100, 100);
//		
//		// 타원형
//		g.drawOval(350, 30, 100, 100);
//		
//		// 호
//		g.drawArc(550, 30, 150, 100, 45, 90);
//	
//	}
		
}
