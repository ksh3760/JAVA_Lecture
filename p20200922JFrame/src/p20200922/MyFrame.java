package p20200922;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���ؽ�");
		
		// �����̳ʿ� ��ġ�� �����ϱ� ���� ��ü�� �߰��Ѵ�.
		// ���������� ��ġ�ϴ� ��ġ������ ��ü�� ����
		// * ���� ��ġ�����ڸ� �������� ������ ��ư2�� ���δ�.
		FlowLayout f = new FlowLayout(FlowLayout.LEADING, 10, 10);
		// ��ġ������ ��ü�� Frame�� �����Ѵ�.
		this.setLayout(f);
		
		// ������ �ٲٸ� ���� default���� �ƴ� �ڽ��� ���ϴ� �������� ��ġ����
		this.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
//		// ��ư 1�� ����	 -> �⺻ ������Ʈ ����
//		JButton btn1 = new JButton("��ư1");
//		
//		// ��ư�� �����̳ʿ� �߰�
//		// this : �ڱ��ڽ��� ��ü ����
//		this.add(btn1);
//		
//		// ��ư 1�� ����	 -> �⺻ ������Ʈ ����
//		JButton btn2 = new JButton("��ư2");
//		
//		// ��ư�� �����̳ʿ� �߰�
//		// this : �ڱ��ڽ��� ��ü ����
//		this.add(btn2);

		for(char i = 'a' ; i < 'k' ; i++) {
			this.add(new JButton("��ư" + i));
		}
		
		
		setVisible(true);
	}
}
