import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

    public class byteStream {
        public static void main(String[] args) throws IOException {
        // 파일 입 출력

            FileInputStream in = null;
            FileOutputStream out = null;

            try {
                in = new FileInputStream("input.txt");	// input.txt 파일에 연결된 파일 입력 스트림을 생성
                                                                // input.txt의 경로는 프로젝트 파일 내에 있어야 한다.
                out = new FileOutputStream("output.txt");	// output.txt 파일에 연결된 파일 출력 스트림을 생성
                int c;

                while((c = in.read()) != -1) {  // read()는 int값을 반환한다.
                    out.write(c);   // 하나의 바이트를 읽을 시 read()를 사용, 하나의 바이트를 쓸 시 write()를 사용
                }
            } finally {
                if (in != null) in.close();
                if (out != null) out.close();
            }

        }
    }

