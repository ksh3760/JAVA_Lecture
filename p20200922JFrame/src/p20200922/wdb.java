package p20200922;

import javax.swing.JFrame;

public class wdb {
	public static void main(String[] args) {
		// 1. 컨테이너를 생성한다.
		JFrame f = new JFrame("엄준식");
		// 프레임(최상위 컴포넌트)의 크기를 설정한다. 폭, 높이
		// 매개변수를 설정하지 않으면 0x0이된다.
		f.setSize(300,200);
		
		// 윈도우의 종료 버튼을 눌렀을때 종료하도록 설정하는 메소드 실행
		// 사용자가 프레임의 오른쪽 상단에 있는 close 버튼을 눌렀을 경우 -> 종료
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// setVisible(true)호출 -> 프레이 화면에 나타나게 한다.
		// 만약 없으면 화면에 프레임이 나타나지 않는다.
		f.setVisible(true);

		MyFrame obj = new MyFrame();
		
		
		
	}// wnd main
}// end class wdb
