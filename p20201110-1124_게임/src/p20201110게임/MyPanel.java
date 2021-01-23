package p20201110����;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Timer;

import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
	private MyRect[][] myRects;
	static int SIZE = 4;
	static int mX;
	static int mY;
	static final int rowNum = 20;		// ���Ǽ�
	static final int colNum = 28;		// ���Ǽ�
	
	Color mBackUpColor = Color.cyan;
	int mDirection = KeyEvent.VK_LEFT;
	boolean isPressd = false;			// ����ڰ� ����Ű�� �������� üũ�Ѵ�.
	int mKeyCode;					    // ����ڰ� ���� ����Ű�� �����Ѵ�.
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		for (int j = 0; j < rowNum; j++) {
			for (int i = 0; i < colNum; i++) {
				myRects[j][i].draw(g);
			}
		}

	}

	MyPanel() {
		init();
	}
	
	public void auto() {
		
		// ���� ĭ�� �Ʒ� ������ Ȯ��
		if (mDirection == KeyEvent.VK_DOWN) {
			if (mX != rowNum - 2) {
				myRects[mX][mY].setMyColor(Color.CYAN);
				mX = mX + 1;
				myRects[mX][mY].setMyColor(Color.BLUE);
			} else {
				mDirection = KeyEvent.VK_UP;
			}
		} else {
			if (mX != KeyEvent.VK_UP) {
				myRects[mX][mY].setMyColor(Color.CYAN);
				mX = mX - 1;
				myRects[mX][mY].setMyColor(Color.BLUE);
			} else {
				mDirection = KeyEvent.VK_DOWN;
			}
		}

		repaint();
	}
	
	public void autoPlay() {
		// ����ڰ� ����Ű�� �������� üũ
		if (isPressd) { // 3. �����ٸ� �ش� �������� �̵�
			myRects[mX][mY].setMyColor(mBackUpColor);	// ������ ����� ������ ����
			
			switch(mKeyCode) {
			case KeyEvent.VK_UP :
				mDirection = KeyEvent.VK_UP;
				if (mX != 1) mX = mX -1; 
				break;
				
			case KeyEvent.VK_DOWN : 
				mDirection = KeyEvent.VK_DOWN;
				if (mX != rowNum - 2) mX = mX +1;  
				break;
				
			case KeyEvent.VK_LEFT:   // ���� ���� ��쿡�� �̵��� ���� �ʰ� �Ѵ�.
				mDirection = KeyEvent.VK_LEFT;
				if (mY != 1) mY = mY -1; 
				break;
				
			case KeyEvent.VK_RIGHT :
				mDirection = KeyEvent.VK_RIGHT;
				if (mY != colNum - 2) mY = mY +1;  
				break;
				
			}
			
			mBackUpColor = myRects[mX][mY].getMyColor(); // ���� ��ġ�� ������ �����Ѵ�.
			myRects[mX][mY].setMyColor(Color.BLUE);
			
		} else { // ������ �ʾҴٸ� ���� �������� �̵�
			myRects[mX][mY].setMyColor(mBackUpColor);	// ������ ����� ����� �����Ѵ�.
			
			switch(mDirection) {
			case KeyEvent.VK_UP :	
				if (mX != 1) mX = mX -1; 
				break;
				
			case KeyEvent.VK_DOWN : 
				if (mX != rowNum - 2) mX = mX +1;  
				break;
				
			case KeyEvent.VK_LEFT:   // ���� ���� ��쿡�� �̵��� ���� �ʰ� �Ѵ�.
				if (mY != 1) mY = mY -1; 
				break;
				
			case KeyEvent.VK_RIGHT :
				if (mY != colNum - 2) mY = mY +1;  
				break;
				
			}
			
			mBackUpColor = myRects[mX][mY].getMyColor(); // ���� ��ġ�� ������ �����Ѵ�.
			myRects[mX][mY].setMyColor(Color.BLUE);
		}
		
		repaint();
		
	}

	// �ʱ�ȭ �۾�
	private void init() {
		// Ÿ�̸� ����� ���� ���
		// Ÿ�̸� ��ü�� ����
		Timer timer = new Timer();
		
		// myTimeEvent ��ü�� �����Ѵ�.
		MyTimeEvent myTimerEvent = new MyTimeEvent(this);
		
		// ���� ���� Ÿ�̸� ��ü�� ���۽ð��� Ʈ���� �ð��� Ʈ���� �� �� ������ �̺�Ʈ ��ü�� �����Ѵ�.
		timer.schedule(myTimerEvent, 1000, 200);
		
				
		// �߾���
		mX = rowNum / 2;
		mY = colNum / 2;
		
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("a.bin");
			
			mX = in.read();
			mY = in.read();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// myRect ��ü���� �����ϰ�, ��ǥ������ �ʱ�ȭ �Ѵ�.
		int[] xPoints = new int[SIZE];
		int[] yPoints = new int[SIZE];
		int nPoints;
		Color myColor;
		nPoints = 4;
		myColor = Color.RED;

		yPoints[0] = 10;
		yPoints[1] = 10;
		yPoints[2] = 35;
		yPoints[3] = 35;

		myRects = new MyRect[rowNum][colNum];

		for (int j = 0; j < rowNum; j++) {
			xPoints[0] = 10;
			xPoints[1] = 35;
			xPoints[2] = 35;
			xPoints[3] = 10;

			for (int i = 0; i < colNum; i++) {
				// �����Ϸ��� �ϴ� ��ü�� �׵θ��� �ִ��� �˻��Ͽ� 
				// �׵θ��� ������ myColor �� �ٸ� ������ ����
				if( j ==0 || j == rowNum-1 || i ==0 || i == colNum-1) {
					myColor = Color.RED;
				} else {
					myColor = Color.CYAN;
				}
				
				// �߰��� ��ġ�� ���̸� ������ �Ķ������� ����
				if( j == mX && i ==mY ) {
					myColor = Color.BLUE;
				}
				
				
				MyRect myRect = new MyRect(xPoints, yPoints, nPoints, myColor);
				myRects[j][i] = myRect;
				for (int k = 0; k < 4; k++) {
					xPoints[k] = xPoints[k] + 27;
				}
			}
			for (int k = 0; k < 4; k++) {
				yPoints[k] = yPoints[k] + 27;
			}

		}	
		
		addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		int keycode = e.getKeyCode();
		
		if (keycode == KeyEvent.VK_UP || keycode == KeyEvent.VK_DOWN ||
			keycode == KeyEvent.VK_LEFT || keycode == KeyEvent.VK_RIGHT)
		{
			isPressd = true;
			mKeyCode = keycode;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
