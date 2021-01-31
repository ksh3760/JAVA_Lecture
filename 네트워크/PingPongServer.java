// 클라이언트 측으로 부터 ping을 받으면 pong을 반환

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PingPongServer {

	public static void main(String[] args) throws Exception {
		System.out.println("서버가 실행중입니다.");

		int clientId = 0;
		
		ServerSocket ss = new ServerSocket(9090);	// 9090 포트로 서버 소켓 생성
		
		try {
			while (true) {
				clientId ++;
				PingPong t = new PingPong(ss.accept(), clientId);
				t.start();
			}
		} finally {
			ss.close();
		}
		
	} // end main

	private static class PingPong extends Thread {
		private Socket socket;
		private int myId;
		
		public PingPong(Socket socket, int clientId) {
			this.socket = socket;
			this.myId = clientId;
		}
		
		public void run() {
			try {
				BufferedReader in = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				
				out.println("클라이언트 번호는 " + myId + "입니다.");
				out.println("단어를 입력하세요.");
				
				while (true) {
					String input = in.readLine();
					
					if (input.equals("ping") == true) {
						out.println("pong");
					} else {
						out.println("");
					}
					
				}
				
			} catch (IOException e) {
				System.out.println("클라이언트 번호: " + myId + "처리 실패" + e);
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
					System.out.println("소켓 종료 오류" + e);
				}
				System.out.println("클라이언트 번호: " + myId + "처리 종료");
			}
			
		} // end public void run()
		
	} // end private static class PingPong extends Thread
	
} // end class PingPongServer
