//웹 서버에서 보내주는 HTML파일 저장

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) throws Exception {
		// 1) URL 클래스의 객체를 생성
		URL site = new URL("http://www.naver.com/");
		// 2) 연결 객체를 오픈
		URLConnection url = site.openConnection();
		// 3) 스트림을 연결
		BufferedReader in = new BufferedReader(
							new InputStreamReader(
							url.getInputStream()));
		
		String inLine;
		
		while((inLine = in.readLine()) != null)
			System.out.println(inLine);
		in.close();
	}
}
