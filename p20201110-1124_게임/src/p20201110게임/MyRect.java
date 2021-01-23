package p20201110게임;

import java.awt.Color;
import java.awt.Graphics;

public class MyRect {
	private int[] xPoints;  // x좌표의 배열
	private int[] yPoints;  // y좌표의 배열
	private int nPoints;
	private Color myColor;
	static final int SIZE = 4;  
	
    // 생성자
	public MyRect(int[] x, int[] y, int count, Color color) {
		xPoints = new int[SIZE];
		yPoints = new int[SIZE];
		nPoints = count;
		myColor = color;

		for (int j = 0; j < 4; j++) {
			xPoints[j] = x[j];
			yPoints[j] = y[j];
			System.out.print("(" + xPoints[j] + "," + yPoints[j] + ")" );
		}
	}
     
	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public MyRect() {
		xPoints = new int[SIZE];
		yPoints = new int[SIZE];
		nPoints = SIZE;
		myColor = Color.RED;

		xPoints[0] = 10;
		xPoints[1] = 60;
		xPoints[2] = 60;
		xPoints[3] = 10;

		yPoints[0] = 10;
		yPoints[1] = 10;
		yPoints[2] = 60;
		yPoints[3] = 60;
	}

	public Color getMyColor() {
		return myColor;
	}

	public void draw(Graphics g) {
		g.setColor(myColor);
		g.fillPolygon(xPoints, yPoints, nPoints);
	}
}
