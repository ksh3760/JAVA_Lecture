package p20200922;

import javax.swing.JFrame;

public class wdb {
	public static void main(String[] args) {
		// 1. �����̳ʸ� �����Ѵ�.
		JFrame f = new JFrame("���ؽ�");
		// ������(�ֻ��� ������Ʈ)�� ũ�⸦ �����Ѵ�. ��, ����
		// �Ű������� �������� ������ 0x0�̵ȴ�.
		f.setSize(300,200);
		
		// �������� ���� ��ư�� �������� �����ϵ��� �����ϴ� �޼ҵ� ����
		// ����ڰ� �������� ������ ��ܿ� �ִ� close ��ư�� ������ ��� -> ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// setVisible(true)ȣ�� -> ������ ȭ�鿡 ��Ÿ���� �Ѵ�.
		// ���� ������ ȭ�鿡 �������� ��Ÿ���� �ʴ´�.
		f.setVisible(true);

		MyFrame obj = new MyFrame();
		
		
		
	}// wnd main
}// end class wdb
