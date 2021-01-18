package 스트림연습;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class imageFileCopy {
    public static void main(String[] args) throws IOException {
    // 파일 복사하기
    	
    	Scanner scn = new Scanner(System.in);
        System.out.print("복사할 원본 파일 명을 입력하세요 : ");
        String inputFileName = scn.next();

        System.out.print("복사하는 파일 명을 입력하세요 : ");
        String outputFileName = scn.next();

        try (InputStream inputStream = new FileInputStream(inputFileName);
                OutputStream outputStream = new FileOutputStream(outputFileName)) {
                int c;

                while ((c = inputStream.read()) != -1) {
                    outputStream.write(c);
                }
            }
            System.out.println(inputFileName + "을 " + outputFileName + "(으)로 복사하였습니다.");

   }
}
