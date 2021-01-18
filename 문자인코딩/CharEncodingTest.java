import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharEncodingTest {
	public static void main(String[] args) throws IOException {
		// 문자 
		
		File fileDir = new File("input.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(
				new FileInputStream(fileDir), "UTF-8"));
		
		String str;
		
		while((str = in.readLine()) != null) {
			System.out.println(str);
		}
		
	}
}
