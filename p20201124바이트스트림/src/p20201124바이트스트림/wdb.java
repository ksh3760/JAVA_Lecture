package p20201124����Ʈ��Ʈ��;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class wdb {

	public static void main(String[] args) {
		// ���̳ʸ� ������ �����ؼ� ���� ����
		FileOutputStream out = null;
		byte[] array = new byte[30];
		
		// ���ο� ������ �����.
		try {
			out = new FileOutputStream("C:\\Users\\SH\\Desktop\\test\\a.bin");
			
			for(int i = 0 ; i < 30 ; i++) {
				array[i] = (byte)i;
			}
			
			// ���Ͽ� �����͸� ������.
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
