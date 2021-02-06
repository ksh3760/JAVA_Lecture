import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TicTacTor {

	public static void main(String[] args) throws Exception {
		
		ServerSocket ss = new ServerSocket(9090);
		System.out.println("Tic-Tac-Toc Server online");
		
		try {
			while (true) {
				Game g = new Game();
				
				// 경기자를 나타내는 2개의 객체를 생성
				Player playerA = new Player(g, ss.accept(), 'O');
				Player playerB = new Player(g, ss.accept(), 'X');
				
				// 상대방이 누구인지를 알린다.
				playerA.setOther(playerB);
				playerB.setOther(playerA);
				
				
				// 경기자가 2명이 모이면 게임을 시작한다.
				playerA.start();
				playerB.start();
				System.out.println("game start");
			}
			
		} finally {
			ss.close();
		}
		
	}// end main
	
	// 하나의 게임을 나타내는 클래스
	class Game {
		char boards[][]  = new char[3][3];	// 2차원 문자 배열을 이용하여 보드를 나타낸다.
	
		public void setBoard(int i, int j, char playerMark) {
			boards[i][j] = playerMark;
		}
		
		public char getBoard(int i, int j) {
			return boards[i][j];
		}
		
		// 보드의 현재 상태를 콘솔에 출력한다.
		public void printBoard() {
			for(int k = 0 ; k < 3 ; k++) {
				System.out.println(" " + boards[k][0] + "| " + boards[k][1] 
						+ "| " + boards[k][2]);
				if (k != 2) System.out.println("---|---|---");
				
			}
		}
		
	}// end class Game

	
	// 하나의 경기자를 나타내는 클래스
	class Player extends Thread {
		Game 	       game;			// 경기자가 속한 게임을 가리킨다.
		Socket 		   socket;			// 현재 경기에 연결된 소켓
		BufferedReader input;			// 소켓에서 얻은 입력 스트림
		PrintWriter    output;			// 소켓에서 얻은 출력 스트림 
		char 		   playerMark;		// 현재 경기자가 'O'인지 'X'인지를 나타낸다.
		Player 		   other;			// 상대방 경기자 객체
		
		public Player(Game game, Socket socket, char playerMark) {
			this.game 		= game;
			this.socket 	= socket;
			this.playerMark = playerMark;
		
			try {
				input  = new BufferedReader(new InputStreamReader
							(socket.getInputStream()));
				output = new PrintWriter(socket.getOutputStream(), true);
				output.println("START" + playerMark);
				output.println("WAITING FOR OTHER PLAYER");
				
			} catch (IOException e) {
				System.out.println("DISCONNECTED" + e);
			}
		
		}
		
		public void setOther(Player other) {
			this.other = other;
		}
		
		public void run() {
			try {
				output.println("ALL PLAYERS ARE CONNECTED");
				
				if (playerMark == 'X') {
					output.println("YOUR TURN");
				}
				
				while (true) {
					String command = input.readLine();
					if (command == null) continue;
					if (command.startsWith("MOVE")) { // MOVE 명령어
						int i = Integer.parseInt(command.substring(5, 6));
						int j = Integer.parseInt(command.substring(7, 8));
						game.setBoard(i, j, playerMark);		
						game.printBoard();
						other.output.println("OTHER" + i + " " + j);
						output.println("PLEASE WAIT");
						other.output.println("YOUR TURN");
					} else if (command.startsWith("QUIT")) { // QUIT 명령어
						return;
					}
				}
				
			} catch (IOException e) {
				System.out.println("DISCONNECTED" + e);
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
					
				}
			}
			
		}// public void run()
		
	}// end class Player extends Thread
	
}// end class TicTacTor
