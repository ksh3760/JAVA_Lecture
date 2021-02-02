import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PingPongClient extends JFrame implements ActionListener {

	private BufferedReader in;
	private PrintWriter out;
	private JTextField field;
	private JTextArea area;
	
	public PingPongClient() throws Exception, IOException {
		setTitle("클라이언트 창");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		field = new JTextField(50);
		field.addActionListener(this);
		
		area = new JTextArea(10, 50);
		
		area.setEditable(false);
		add(field, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		
		// 서버에 접속하여 소켓을 생성
		// 소켓에 스트림을 연결
		Socket socket = new Socket("localhost", 9090);
		in = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);
		
		area.append(in.readLine() + "\n");
		area.append(in.readLine() + "\n");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// 엔터키가 입력되면 서버로 입력한 문장을 전송
		// 서버로 부터 오는 단어를 표시
		out.println(field.getText());
		String response = null;
		
		try {
			response = in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		area.append(response + "\n");
	}
	

	public static void main(String[] args) throws Exception {
		PingPongClient client = new PingPongClient();

	}

}
