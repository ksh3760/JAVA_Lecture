package p20201124���̳ʸ��о����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class wdb {

	public static void main(String[] args) {
		// ���̳ʸ� ������ �о�ͼ� ȭ�鿡 ���
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
