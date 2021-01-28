// 구글 서버에 GET방식으로 검색 요청

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpURLTest {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("검색어를 입력하세요 : ");
		String q = scn.next();
		
		HttpURLTest http = new HttpURLTest();
		String site = "http://google.com/search?q=" + q;
		
		URL url = new URL(site);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");	// Request 방법을 설정
		
		int resCode = con.getResponseCode();	// 웹 서버에 데이터 정송
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(	// 스트림 연결
				con.getInputStream()));
		
		String inputLine;
		StringBuffer output = new StringBuffer();
		
		while((inputLine = in.readLine()) != null) {
			output.append(inputLine);
		};
		in.close();
		
		System.out.println(output);
		
	}
}
