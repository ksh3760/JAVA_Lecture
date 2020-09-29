package p20200929배치관리자;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	// 디폴트 생성자
	public MyFrame() {
		// 타이틀 설정
		this.setTitle("엄준식");
		this.setSize(300,200);
		// 종료시 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 생성 및 설정
//		FlowLayout f = new FlowLayout();
//		this.setLayout(f);
		BorderLayout bl = new BorderLayout();
		this.setLayout(bl);
		
		// 버튼 5개 생성 추가
		JButton[] bt = new JButton[6];
		
		for(int i = 0 ; i < bt.length ; i++) {
			bt[i] = new JButton();
			bt[i].setText("a" + i);
//			this.add(bt[i]);
		}
		
		this.add(bt[0], BorderLayout.CENTER);
		this.add(bt[1], BorderLayout.NORTH);
		this.add(bt[2], BorderLayout.EAST);
		this.add(bt[3], BorderLayout.SOUTH);
		this.add(bt[4], BorderLayout.WEST);
		
		// 컨테이너 컴포넌트 JPanel을 사용하여 다른 버튼 두개를 포함시킨다.
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(bt[0]);
		panel.add(bt[5]);
		
		// jtext
		JTextField jtf = new JTextField("웹데이터베이스전공");
		panel.add(jtf);
		JLabel jl = new JLabel("이름 : ");
		panel.add(jl);
		
		this.add(panel, BorderLayout.CENTER);
		
		// 보이게 하자.
		this.setVisible(true);
		
	}
	
}
