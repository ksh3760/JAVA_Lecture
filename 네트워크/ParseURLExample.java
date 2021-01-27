// URL 클래스
import java.net.MalformedURLException;
import java.net.URL;

public class ParseURLExample {

	public static void main(String[] args) throws Exception {
		URL myURL = new URL("http://java.sun.com:80/docs/books/tutorial" + "/index.html?name=database#TOP");	// 객체생성
		
		System.out.println("protocol  = " + myURL.getProtocol());
		System.out.println("authority = " + myURL.getAuthority());
		System.out.println("host      = " + myURL.getHost());
		System.out.println("port      = " + myURL.getPort());
		System.out.println("path      = " + myURL.getPath());
		System.out.println("query     = " + myURL.getQuery());
		System.out.println("filename  = " + myURL.getFile());
		System.out.println("ref       = " + myURL.getRef());
		
	}

}
