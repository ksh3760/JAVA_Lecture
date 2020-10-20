package p20201013이미지;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class MyImagePanel extends JPanel {
	BufferedImage img;
	public MyImagePanel(BufferedImage img) {
		this.img = img;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
	// 이미지의 크기에 패널의 크기를 맞추기 위한 메소드
	@Override
	public Dimension getPreferredSize() {
		if(this.img == null) {
			return new Dimension(100, 100);
		} else {
			return new Dimension(img.getWidth(null), img.getHeight(null));
		}
	}
	
	
	
	
}


