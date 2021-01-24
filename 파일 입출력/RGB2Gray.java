// 이미지 파일에서 RGB값 구한 후 그레이스케일 이미지로 변환

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RGB2Gray {
	BufferedImage myImage;
	int width;
	int height;
	
	public RGB2Gray() {
		File ifile = new File("test.jpg");
		try {
			myImage = ImageIO.read(ifile);
			System.out.println("파일읽기 성공");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일을 읽어올 수 없습니다.");
		}
		width = myImage.getWidth();
		height = myImage.getHeight();
		
		for(int y = 0 ; y < height ; y++) {
			for(int x = 0 ; x < width ; x++) {
				Color c = new Color(myImage.getRGB(x, y));
				int r = (int)(c.getRed() * 0.299);
				int g = (int)(c.getGreen() * 0.587);
				int b = (int)(c.getBlue() * 0.114);
				Color gray = new Color(r + g + b, r + g + b, r + g + b);
				myImage.setRGB(x, y, gray.getRGB());
			}
		}
		
		File ofile = new File("gray.jpg");
		try {
			ImageIO.write(myImage, "jpg", ofile);
			System.out.println("그레이스케일 이미지로 변환 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws Exception {
		RGB2Gray obj = new RGB2Gray();

	}

}
