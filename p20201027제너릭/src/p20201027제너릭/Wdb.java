package p20201027���ʸ�;
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
	 // Box<String> b = new Box<>(); <- ���̾Ƹ�� (Ÿ�� �μ��� ��ü������ ���� �ʾƵ� �����Ϸ����� Ÿ�� ����)
		b.setData("Hello world!");
		String s = b.getData();		// ���Խ� �ڷ����� ���� �ʴ�. �ڽİ�ü�� �θ�ü������ ���� �Ϸ��Ѵ�.
									// �׷����� �����Ϸ� �ϸ� ���� ����ȯ : ��� å���� ���α׷��ӿ��� �ִ�.
		System.out.println(s);
		
	//	Integer i = (Integer)b.getData();

	}

}
