package 네트워크연습;
// 클라이언트 측으로 부터 ping을 받으면 pong을 반환

import java.net.ServerSocket;
import java.net.Socket;

import com.sun.java.accessibility.util.Translator;

public class PingPongServer {

	public static void main(String[] args) throws Exception {
		System.out.println("서버가 실행중입니다.");

		int clientId = 0;
		
		ServerSocket ss = new ServerSocket(9090);	// 9090 포트로 서버 소켓 생성
		
		try {
			while (true) {
				clientId ++;
				Translator t = new Translator(ss.accept(), clientId);
				t.start();
			}
		} finally {
			ss.close();
		}
		
	} // end main

	private static class Translator extends Thread {
		private Socket socket;
		private int myId;
		
	}
	
} // end class PingPongServer
