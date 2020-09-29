package p20200908자바수업;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class DepartmentManager {
   Connection conn = null;

	  void connect() {
	    // 1. JDBC 드라이버를 적재
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		}
		
		System.out.println("첫번째 테스트");
	
	  // 2. 데이터베이스 연결
		String url		= "jdnc:oracle:thin:@net.yju.ac.kr:1521:orcl";
		String id 		= "s1701052";								
		String password = "p1701052";								
		Connection conn 	= null;
		
		try {
			conn = DriverManager.getConnection(url , id, password);
			System.out.println("연결 성공");
		} catch (SQLException e) {
			System.out.println("연결 오류");
		}
		
		System.out.println("두번째 테스트");
	      
	}// end void connect()
 
// ------------------------------------------------------------------------------------

   // SQL문을 입력받아 DB에 처리하는 메소드
   void insert(String sql) {
      try {
         Statement stmt = conn.createStatement();
         int n = stmt.executeUpdate(sql);
         System.out.println(n + "개의 행이 삽입되었습니다.");
         stmt.close();
      } catch (SQLException e) {
	         e.printStackTrace();
	      }

   }// end void insert
      
   
   // Department 테이블의 모두 행을 조회하는 메소드
   public void searchAll() {
      // 3. SQL문장 작성 및 전송
      try {
         Statement stmt = conn.createStatement();
         String sql = "select * from DEPARTMENT";
         ResultSet rs = stmt.executeQuery(sql);
         System.out.println("쿼리를 요청하였습니다.");
         // 4. 결과집합 사용 후 연결 해제
         // 결과 집합의 첫번째 레코드로 커서를 이동시킨다.
         while (rs.next()) {
            System.out.println(rs.getInt("DEPTNO") + " : " + rs.getString("DEPTNAME") + " : " + rs.getInt("FLOOR"));
         }

         stmt.close();

      } catch (SQLException e) {
         System.out.println("예외가 발생하였습니다.");
      }

   }// end public void searchAll()

   
   // 부서번호 no 를 주면 해당 레코드를 삭제
   public void delete(int no) {
      try {
         String sql = "delete DEPARTMENT where DEPTNO =" + no;
         Statement stmt = conn.createStatement();
         int n = stmt.executeUpdate(sql);
         System.out.println(n + "개의 행이 삭제되었습니다.");
         stmt.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }// end public void delete()
   

   // 부서이름의 일부로 검색 ( "총" 이라고 입력하면 총무 부서 레코드 출력 )
   public void search(String bName) {
	      try {
	          Statement stmt = conn.createStatement();
	          String sql = "select * from DEPARTMENT where ";
	          ResultSet rs = stmt.executeQuery(sql);
	          System.out.println("쿼리를 요청하였습니다.");
	          // 4. 결과집합 사용 후 연결 해제
	          // 결과 집합의 첫번째 레코드로 커서를 이동시킨다.
	          while (rs.next()) {
	             System.out.println(rs.getInt("DEPTNO") + " : " + rs.getString("DEPTNAME") + " : " + rs.getInt("FLOOR"));
	          }

	          stmt.close();

	       } catch (SQLException e) {
	          System.out.println("예외가 발생하였습니다.");
	       }
   }// end public void search()
   
		
   public void close() {
      try {
         conn.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
   }// end public void close()
		   
		
}// end class DepartmentManager


public class Main {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	      DepartmentManager manager = new DepartmentManager();
	      manager.connect();
	      while (true) {

	    	 System.out.println("-------------------------------------------------");
	         System.out.println("*메뉴를 입력 1: 삽입, 2 : 이름검색, 3: 삭제, 4:전체조회 , 9:종료*");
	         int data = input.nextInt();
	         
	         switch (data) {
	         case 1: // 삽입
	            System.out.print("부서번호 입력 : ");
	            int no = input.nextInt();
	            System.out.print("부서명 입력 : ");
	            String name = input.next();
	            System.out.print("층 입력 : ");
	            int floor = input.nextInt();
	            // 입력받은 데이터를 이용하여 SQL문 생성한다.
	            // insert into DEPARTMENT(DEPTNO, DEPTNAME, FLOOR) values( 1,
	            // '영업',
	            // 3)
	            String sql = "insert into DEPARTMENT(DEPTNO, DEPTNAME, FLOOR) values( ";
	            sql = sql + no + ", '" + name + "', " + floor + ")";
	            System.out.println(sql);
	            // 작업.
	            manager.insert(sql);
	            break;
	            
	         case 2: // 부서이름의 일부로 검색 ( "총" 이라고 입력하면 총무 부서 레코드 출력 )
		            String bName = input.next();
		            manager.search(bName);
		            break;   
		            
	         case 3: // 부서번호를 주면 해당 레코드를 삭제
		            no = input.nextInt();
		            ;
		            manager.delete(no);
		            break;
	            
	         case 4:
	            manager.searchAll();
	            break;

	         }

	         if (data == 9) {
	            manager.close();
	            break;
	         }

      }

   }// end main

}// end class Main
