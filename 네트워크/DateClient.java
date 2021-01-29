// 날짜 클라이언트
// 서버로 부터 날짜 정보를 받는다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DataClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 9090);	// 포트 9100버능로 연결 시도
		
		BufferedReader input = new BufferedReader(
				new InputStreamReader(s.getInputStream()));	// 소켓으로부터 스트림을 얻는다.
		
		String res = input.readLine();
		System.out.println(res);
		
		System.exit(0);
		
	}
}
