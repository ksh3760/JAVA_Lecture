package p20201013�����̹���;

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
	
	// ������
	public MyFrame() {
		setTitle("���ؽ� ���� ����");
		
		try {
			img = ImageIO.read(new File("C:\\Users\\SH\\eclipse-workspace\\p20201013�����̹���\\src\\p20201013�����̹���\\puppy.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// ������ȣ�� ������ �迭�� �����ϰ� �ʱ�ȭ
		pieceNumber = new int[totalPieces];
		for(int i = 0 ; i < totalPieces ; i++) {
			pieceNumber[i] = i;
		}
		
		// �г� ���� �� �߰�
		MyPanel myPanel = new MyPanel(img);
		
		setLayout(new BorderLayout());
		add(myPanel, BorderLayout.CENTER);
		
		// ��ư ���� �� �߰�
		Button button = new Button("�����ϱ�");
		add(button, BorderLayout.SOUTH);
		// ��ư�� ������ ����
		button.addActionListener(this);
		
		setSize(600, 600);
		setVisible(true);
		
	}
	
	void divide() {
		Random rand = new Random();
		int ri;
		for(int i = 0 ; i < totalPieces ; i++) {
			ri = rand.nextInt(totalPieces);		 // 0���� totalpieces ������ ������ ����
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
