package p20201020Ű�̺�Ʈ;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MykeyFrame extends JFrame {
	public MykeyFrame(String name) {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(name);
		
		// �ؽ�Ʈ�ʵ� ������Ʈ ����
		JTextField tf = new JTextField(20);
		// ������ ��ü ����
		MyKeyListener listener = new MyKeyListener();
		// �ؽ�Ʈ�ʵ� ������Ʈ �̺�Ʈ ��ü ���
		tf.addKeyListener(listener);
		// �ؽ�Ʈ�ʵ� ������Ʈ�� �����ӿ� �߰�
		add(tf);
		this.setVisible(true);
	}
}
