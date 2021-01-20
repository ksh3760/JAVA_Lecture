package 스트림연습;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			int c;
			
			out = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream("data.bin")));
			out.writeDouble(3.14);
			out.writeInt(100);
			out.writeUTF("자신의 생각을 바꾸지 못하는 사람은 결코 현실을 바꿀 수 없다.");
			
			out.flush();
			in = new DataInputStream(new BufferedInputStream(	//DataOutputStream은 기존의 바이트 스트림 객체
					new FileInputStream("data.bin")));			// 랩퍼 클래스로만 생성될 수 있기 때문에 먼저 버퍼된
																// 파일 출력 바이트 스트림을 생성하고 이것을 생성자의 매개 변수로 전달한다.
			System.out.println(in.readDouble());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());	// writeUTF() 메소드는 문자열을 UTF-8의 변형된 형식으로 출력한다.			
												// UTF-8은 일반적인 영문자를 하나의 바이트로 표현하는 가변 길이 문자 엔코딩이다.
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}
}
