package ��Ʈ��ũ����;
// Ŭ���̾�Ʈ ������ ���� ping�� ������ pong�� ��ȯ

import java.net.ServerSocket;
import java.net.Socket;

import com.sun.java.accessibility.util.Translator;

public class PingPongServer {

	public static void main(String[] args) throws Exception {
		System.out.println("������ �������Դϴ�.");

		int clientId = 0;
		
		ServerSocket ss = new ServerSocket(9090);	// 9090 ��Ʈ�� ���� ���� ����
		
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
