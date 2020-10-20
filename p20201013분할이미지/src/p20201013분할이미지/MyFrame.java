package p20201013분할이미지;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	BufferedImage img;
	static int pieces = 5;
	int totalPieces = pieces * pieces;
	static int[] pieceNumber;
	
	// 생성자
	public MyFrame() {
		setTitle("엄준식 분할 사진");
		
		try {
			img = ImageIO.read(new File("C:\\Users\\SH\\eclipse-workspace\\p20201013분할이미지\\src\\p20201013분할이미지\\puppy.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// 조각번호를 저장할 배열을 생성하고 초기화
		pieceNumber = new int[totalPieces];
		for(int i = 0 ; i < totalPieces ; i++) {
			pieceNumber[i] = i;
		}
		
		// 패널 생성 및 추가
		MyPanel myPanel = new MyPanel(img);
		
		setLayout(new BorderLayout());
		add(myPanel, BorderLayout.CENTER);
		
		// 버튼 생성 및 추가
		Button button = new Button("분할하기");
		add(button, BorderLayout.SOUTH);
		// 버튼에 리스터 연결
		button.addActionListener(this);
		
		setSize(600, 600);
		setVisible(true);
		
	}
	
	void divide() {
		Random rand = new Random();
		int ri;
		for(int i = 0 ; i < totalPieces ; i++) {
			ri = rand.nextInt(totalPieces);		 // 0부터 totalpieces 사이의 난수를 생성
			int tmp = pieceNumber[i] = pieceNumber[ri];
			pieceNumber[ri] = tmp;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		divide();
		repaint();
	}
	
	
}
