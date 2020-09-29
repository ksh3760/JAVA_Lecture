package p20200922;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("엄준식");
		
		// 컨테이너에 배치를 관리하기 위한 객체를 추가한다.
		// 순차적으로 배치하는 배치관리자 객체를 생성
		// * 만약 배치관리자를 설정하지 않으면 버튼2만 보인다.
		FlowLayout f = new FlowLayout(FlowLayout.LEADING, 10, 10);
		// 배치관리자 객체를 Frame에 설정한다.
		this.setLayout(f);
		
		// 설정을 바꾸면 기존 default값이 아닌 자신이 원하는 방향으로 배치가능
		this.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
//		// 버튼 1개 생성	 -> 기본 컴포넌트 생성
//		JButton btn1 = new JButton("버튼1");
//		
//		// 버튼을 컨테이너에 추가
//		// this : 자기자신의 객체 변수
//		this.add(btn1);
//		
//		// 버튼 1개 생성	 -> 기본 컴포넌트 생성
//		JButton btn2 = new JButton("버튼2");
//		
//		// 버튼을 컨테이너에 추가
//		// this : 자기자신의 객체 변수
//		this.add(btn2);

		for(char i = 'a' ; i < 'k' ; i++) {
			this.add(new JButton("버튼" + i));
		}
		
		
		setVisible(true);
	}
}
