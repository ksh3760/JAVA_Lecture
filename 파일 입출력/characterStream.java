import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class characterStream {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("input.txt");      // input.txt 파일에 연결된 파일 입력 스트림을 생성
            outputStream = new FileWriter("output.txt");    // output.txt 파일에 연결된 파일 출력 스트림을 생성

            int c;
            while ((c = inputStream.read()) != -1) {    // 하나의 문자를 읽을 때는 read()를 사용하고
                outputStream.write(c);                  // 하나의 문자를 쓸 때는 write()를 사용한다.
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

    }
}
