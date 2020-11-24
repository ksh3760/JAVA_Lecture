package p20201124바이너리읽어오기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class wdb {

	public static void main(String[] args) {
		// 바이너리 파일을 읽어와서 화면에 출력
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("C:\\Users\\SH\\Desktop\\test\\a.bin");
			
			int c;
			
			while((c = in.read()) != -1) {
				System.out.println(c);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
