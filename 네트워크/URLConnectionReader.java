//�� �������� �����ִ� HTML���� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) throws Exception {
		// 1) URL Ŭ������ ��ü�� ����
		URL site = new URL("http://www.naver.com/");
		// 2) ���� ��ü�� ����
		URLConnection url = site.openConnection();
		// 3) ��Ʈ���� ����
		BufferedReader in = new BufferedReader(
							new InputStreamReader(
							url.getInputStream()));
		
		String inLine;
		
		while((inLine = in.readLine()) != null)
			System.out.println(inLine);
		in.close();
	}
}
