package p20201027����;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Wdb {

	public static void main(String[] args) {
	//	ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("����");
		list.add("��");
		list.add("����");
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("list element : " + i + " : " + list.get(i));
		
		}
		
		// ArrayList�� 1���� ����� �߰��Ͽ� ������ �ִ� �迭���� �ڷ� �з����Ե�
		list.add(1, "���");
		
		System.out.println("-----");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("list element : " + i + " : " + list.get(i));
		
		}
		
		// ���� ������ �ٲ���
		list.set(2, "����");
		// �ݺ��ڸ� ����Ͽ� Collection�� ���Ҹ� �������
		Iterator iter = list.iterator();
		
		System.out.println("-----");
		while(iter.hasNext()) {		// hasNext : �������� �ִ°�?
			System.out.println(iter.next() );	// next : �������� �ҷ��´�.
		}
		
		// ��� ����
		list.remove("���");	// (= list.remove(1); )
		System.out.println("-----");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("list element : " + i + " : " + list.get(i));
		
		}
		
		// ������ ����Ǿ� �ִ� �ε����� ����Ͻÿ�.
		int index = list.indexOf("����");
		System.out.println("������ ����Ǿ� �ִ� �ε���  : " + index);
		
		// ������ �ε����� �̿��Ͽ� �����Ͻÿ�.
		list.remove(index);
		iter = list.iterator();
		while(iter.hasNext()) {		
			System.out.println(iter.next() );
		}
		
		
		
		
		
		
		
		
//		Vector<String> vc = new Vector<String>();	// �� vector���� string Ÿ�Ը� �ְڴ�.
//		
//		vc.add("������ ����");
//		vc.add(new String("10"));
//		vc.add("20");
//		
//		System.out.println("vector size : " + vc.size());
//
//		for(int i = 0 ; i < vc.size() ; i++) {
//			System.out.println("Vector element : " + i + " : " + vc.get(i));
//		}
	
	
	}

}
