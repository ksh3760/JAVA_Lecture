package 웹이미지파일다운;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws Exception {
		String webSite = "주소를 입력하세요";
		System.out.println("" + webSite + " 에서 이미지를 다운로드");

		URL url = new URL(webSite);
		byte[] buffer = new byte[2048];
		
		try (InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("test.jpg");) {	// 파일명
			int length = 0;
			
			while ((length = in.read(buffer)) != -1) {
				System.out.println("" + length + "바이트 만큼 읽었음");
				out.write(buffer, 0, length);
			}
			
			in.close();
			out.close();
			
			System.out.println("완료");
			
		} catch (Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
		
	}

}
