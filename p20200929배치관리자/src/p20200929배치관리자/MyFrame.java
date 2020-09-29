package p20200929��ġ������;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	// ����Ʈ ������
	public MyFrame() {
		// Ÿ��Ʋ ����
		this.setTitle("���ؽ�");
		this.setSize(300,200);
		// ����� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���̾ƿ� ���� �� ����
//		FlowLayout f = new FlowLayout();
//		this.setLayout(f);
		BorderLayout bl = new BorderLayout();
		this.setLayout(bl);
		
		// ��ư 5�� ���� �߰�
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
		
		// �����̳� ������Ʈ JPanel�� ����Ͽ� �ٸ� ��ư �ΰ��� ���Խ�Ų��.
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(bt[0]);
		panel.add(bt[5]);
		
		// jtext
		JTextField jtf = new JTextField("�������ͺ��̽�����");
		panel.add(jtf);
		JLabel jl = new JLabel("�̸� : ");
		panel.add(jl);
		
		this.add(panel, BorderLayout.CENTER);
		
		// ���̰� ����.
		this.setVisible(true);
		
	}
	
}
