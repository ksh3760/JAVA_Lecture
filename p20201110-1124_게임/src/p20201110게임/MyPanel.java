package p20201110게임;

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
	static final int rowNum = 20;		// 행의수
	static final int colNum = 28;		// 열의수
	
	Color mBackUpColor = Color.cyan;
	int mDirection = KeyEvent.VK_LEFT;
	boolean isPressd = false;			// 사용자가 방향키를 눌렀는지 체크한다.
	int mKeyCode;					    // 사용자가 누른 방향키를 저장한다.
	
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
		
		// 다음 칸이 아래 벽인지 확인
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
		// 사용자가 방향키를 눌렀는지 체크
		if (isPressd) { // 3. 눌렀다면 해당 방향으로 이동
			myRects[mX][mY].setMyColor(mBackUpColor);	// 이전에 백업한 색으로 지정
			
			switch(mKeyCode) {
			case KeyEvent.VK_UP :
				mDirection = KeyEvent.VK_UP;
				if (mX != 1) mX = mX -1; 
				break;
				
			case KeyEvent.VK_DOWN : 
				mDirection = KeyEvent.VK_DOWN;
				if (mX != rowNum - 2) mX = mX +1;  
				break;
				
			case KeyEvent.VK_LEFT:   // 왼쪽 벽인 경우에는 이동이 되지 않게 한다.
				mDirection = KeyEvent.VK_LEFT;
				if (mY != 1) mY = mY -1; 
				break;
				
			case KeyEvent.VK_RIGHT :
				mDirection = KeyEvent.VK_RIGHT;
				if (mY != colNum - 2) mY = mY +1;  
				break;
				
			}
			
			mBackUpColor = myRects[mX][mY].getMyColor(); // 현재 위치의 색깔을 저장한다.
			myRects[mX][mY].setMyColor(Color.BLUE);
			
		} else { // 누르지 않았다면 지금 방향으로 이동
			myRects[mX][mY].setMyColor(mBackUpColor);	// 이전에 백업한 색깔로 설정한다.
			
			switch(mDirection) {
			case KeyEvent.VK_UP :	
				if (mX != 1) mX = mX -1; 
				break;
				
			case KeyEvent.VK_DOWN : 
				if (mX != rowNum - 2) mX = mX +1;  
				break;
				
			case KeyEvent.VK_LEFT:   // 왼쪽 벽인 경우에는 이동이 되지 않게 한다.
				if (mY != 1) mY = mY -1; 
				break;
				
			case KeyEvent.VK_RIGHT :
				if (mY != colNum - 2) mY = mY +1;  
				break;
				
			}
			
			mBackUpColor = myRects[mX][mY].getMyColor(); // 현재 위치의 색깔을 저장한다.
			myRects[mX][mY].setMyColor(Color.BLUE);
		}
		
		repaint();
		
	}

	// 초기화 작업
	private void init() {
		// 타이머 사용을 위한 등록
		// 타이머 객체를 생성
		Timer timer = new Timer();
		
		// myTimeEvent 객체를 생성한다.
		MyTimeEvent myTimerEvent = new MyTimeEvent(this);
		
		// 새로 만든 타이머 객체에 시작시각과 트리거 시간과 트리거 될 때 수행할 이벤트 객체를 지정한다.
		timer.schedule(myTimerEvent, 1000, 200);
		
				
		// 중앙점
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
		
		
		// myRect 객체들을 생성하고, 좌표값들을 초기화 한다.
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
				// 생성하려고 하는 객체가 테두리에 있는지 검사하여 
				// 테두리에 있으면 myColor 를 다른 색으로 지정
				if( j ==0 || j == rowNum-1 || i ==0 || i == colNum-1) {
					myColor = Color.RED;
				} else {
					myColor = Color.CYAN;
				}
				
				// 중간에 위치한 것이면 색깔을 파란색으로 설정
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
