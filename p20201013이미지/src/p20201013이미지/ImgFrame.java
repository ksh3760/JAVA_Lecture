package p20201013�̹���;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class ImgFrame extends JFrame {
	BufferedImage img = null;
	
	public ImgFrame() {
		setTitle("���ؽ�");
		
		try {
			img = ImageIO.read(new File("C:\\Users\\SH\\eclipse-workspace\\p20201013�̹���\\src\\p20201013�̹���\\puppy.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);;
		}
		
		MyImagePanel panel = new MyImagePanel(img);
		add(panel);
		pack();
		setVisible(true);

	}
}
