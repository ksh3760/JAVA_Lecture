// ��¥ Ŭ���̾�Ʈ
// ������ ���� ��¥ ������ �޴´�.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DataClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("localhost", 9100);	// ��Ʈ 9100���ɷ� ���� �õ�
		
		BufferedReader input = new BufferedReader(
				new InputStreamReader(s.getInputStream()));	// �������κ��� ��Ʈ���� ��´�.
		
		String res = input.readLine();
		System.out.println(res);
		
		System.exit(0);
		
	}
}
