package p20201027벡터;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Wdb {

	public static void main(String[] args) {
	//	ArrayList<String> list = new ArrayList<String>();
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("우유");
		list.add("빵");
		list.add("버터");
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("list element : " + i + " : " + list.get(i));
		
		}
		
		// ArrayList의 1번에 사과를 추가하여 기존에 있던 배열들이 뒤로 밀려나게됨
		list.add(1, "사과");
		
		System.out.println("-----");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("list element : " + i + " : " + list.get(i));
		
		}
		
		// 빵을 포도로 바꾸자
		list.set(2, "포도");
		// 반복자를 사용하여 Collection의 원소를 출력하자
		Iterator iter = list.iterator();
		
		System.out.println("-----");
		while(iter.hasNext()) {		// hasNext : 다음것이 있는가?
			System.out.println(iter.next() );	// next : 다음것을 불러온다.
		}
		
		// 사과 삭제
		list.remove("사과");	// (= list.remove(1); )
		System.out.println("-----");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println("list element : " + i + " : " + list.get(i));
		
		}
		
		// 포도가 저장되어 있는 인덱스를 출력하시오.
		int index = list.indexOf("포도");
		System.out.println("포도가 저장되어 있는 인덱스  : " + index);
		
		// 포도를 인덱스를 이용하여 삭제하시오.
		list.remove(index);
		iter = list.iterator();
		while(iter.hasNext()) {		
			System.out.println(iter.next() );
		}
		
		
		
		
		
		
		
		
//		Vector<String> vc = new Vector<String>();	// 이 vector에는 string 타입만 넣겠다.
//		
//		vc.add("공부좀 하자");
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
