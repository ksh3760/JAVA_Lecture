import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScanText {
	public static void main(String[] args) throws IOException {
		// --------------------------------
		// Scanner 클래스로 기초 자료형 읽기
		// --------------------------------
		// double값들을 읽어서 합을 계산
		
		Scanner s = null;
		double sum = 0;
		PrintWriter out = null;
		
		out = new PrintWriter(new FileWriter("output.txt"));
		out.println("123,400");
		out.println("56.7");
		out.flush();
		
		// 파일 리더에 버퍼를 연결하고 버퍼에 스캐너를 연결한다.
		s = new Scanner(new BufferedReader(new FileReader("output.txt")));
		while(s.hasNext()) {
			if(s.hasNextDouble()) {
				sum += s.nextDouble();
			} else {
				s.next();
			}
		}
		if (out != null) out.close();
		if (s != null) s.close();
		
		System.out.println(sum);

	}
}
