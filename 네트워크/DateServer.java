// 날짜 서버
// 서버는 클라이언트 측으로 날짜를 전송

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9100);	// 포트 9100번으로 서버 소캣을 생성
		 
		try {
			while (true) {
				Socket socket = ss.accept();	// 클라이언트의 연결을 기다림
												// 서버는 무한히 실행
			
				try {
					PrintWriter out = new PrintWriter(
							socket.getOutputStream(), true);
					out.println(new Date().toString());	// 날짜를 클라이언트로 전송
					
				} finally {
					socket.close();
				}
			}
			
		} finally {
			ss.close();
			
		}

		
	}
}
