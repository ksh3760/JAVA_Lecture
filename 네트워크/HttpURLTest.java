// ���� ������ GET������� �˻� ��û

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpURLTest {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�˻�� �Է��ϼ��� : ");
		String q = scn.next();
		
		HttpURLTest http = new HttpURLTest();
		String site = "http://google.com/search?q=" + q;
		
		URL url = new URL(site);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", "Mozilla/5.0");	// Request ����� ����
		
		int resCode = con.getResponseCode();	// �� ������ ������ ����
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(	// ��Ʈ�� ����
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
