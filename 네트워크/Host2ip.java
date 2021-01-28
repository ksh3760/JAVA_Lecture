// 호스트 이름으로 IP 주소 출력 프로그램

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host2ip {

	public static void main(String[] args) throws IOException{
		String hostname = "www.naver.com";
		
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP Adress : " + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(hostname + "의 주소를 찾을 수 없음");
		}

	}

}
