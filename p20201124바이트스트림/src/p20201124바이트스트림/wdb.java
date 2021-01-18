package p20201124바이트스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class wdb {

	public static void main(String[] args) {
		// 바이너리 파일을 생성해서 값을 저장
		FileOutputStream out = null;
		byte[] array = new byte[30];
		
		// 새로운 파일을 만든다.
		try {
			out = new FileOutputStream("a.bin");
			
			for(int i = 0 ; i < 30 ; i++) {
				array[i] = (byte)i;
			}
			
			// 파일에 데이터를 보낸다.
//			out.write(1);
			out.write(array);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}

}
