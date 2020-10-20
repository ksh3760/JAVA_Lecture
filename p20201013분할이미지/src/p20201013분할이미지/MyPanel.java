package p20201013�����̹���;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	BufferedImage img;
	
	public MyPanel(BufferedImage img) {
		this.img = img;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

			// ȭ�� ������ �̹��� ������ ���ҵ� �κ��� �׷��ش�.
		
			// ������ ���� ���̸� ����
			int pieceWidth = img.getWidth() / MyFrame.pieces;
			int pieceHeight = img.getHeight() / MyFrame.pieces;
			
			for(int x = 0 ; x < MyFrame.pieces ; x++) {
				int sx = x * pieceWidth;
				
				for(int y = 0 ; y < MyFrame.pieces ; y++) {
					int sy = y * pieceHeight;
					int number = MyFrame.pieceNumber[x * MyFrame.pieces + y];
					int dx = (number / MyFrame.pieces) * pieceWidth;
					int dy = (number % MyFrame.pieces) * pieceHeight;
					g.drawImage(img, dx, dy, dx + pieceWidth, dy + pieceHeight,
							sx, sy, sx + pieceWidth, sy + pieceHeight, null);
				}
			}

		

		
	}
	
	

}
