package ���̹������ϴٿ�;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws Exception {
		String webSite = "�ּҸ� �Է��ϼ���";
		System.out.println("" + webSite + " ���� �̹����� �ٿ�ε�");

		URL url = new URL(webSite);
		byte[] buffer = new byte[2048];
		
		try (InputStream in = url.openStream();
				OutputStream out = new FileOutputStream("test.jpg");) {	// ���ϸ�
			int length = 0;
			
			while ((length = in.read(buffer)) != -1) {
				System.out.println("" + length + "����Ʈ ��ŭ �о���");
				out.write(buffer, 0, length);
			}
			
			in.close();
			out.close();
			
			System.out.println("�Ϸ�");
			
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
		}
		
	}

}
