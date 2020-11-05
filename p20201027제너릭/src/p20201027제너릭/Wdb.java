package p20201027제너릭;
// generic class
class Box<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

public class Wdb {

	public static void main(String[] args) {
		Box<String> b = new Box<String>();
	 // Box<String> b = new Box<>(); <- 다이아몬드 (타입 인수를 구체적으로 주지 않아도 컴파일러에서 타입 추측)
		b.setData("Hello world!");
		String s = b.getData();		// 대입시 자료형이 같지 않다. 자식객체를 부모객체변수에 저장 하려한다.
									// 그럼에도 대입하려 하면 강제 형변환 : 모든 책임은 프로그래머에게 있다.
		System.out.println(s);
		
	//	Integer i = (Integer)b.getData();

	}

}
