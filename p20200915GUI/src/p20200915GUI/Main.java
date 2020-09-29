package p20200915GUI;

import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;

class DepartmentManager {
   Connection conn = null;

   void connect() {
      // 1. JDBC 드라이버를 적재
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이버 적재 성공");
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버를 찾을 수 없습니다. ");
      }
      System.out.println("2020-09-08 오후 2시 35분  ");

      // 2. 데이터베이스 연결

      String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
      String id = "s1701052";
      String password = "p1701052";

      try {
         conn = DriverManager.getConnection(url, id, password);
         System.out.println("연결 성공");
      } catch (SQLException e) {
         System.out.println("연결에 실패하였습니다.");
      }
      
      System.out.println("2020-09-08 오후 2시 37분  ");
      
   }// end void connect()

   // Department 테이블의 모두 행을 조회하는 메소드
   public void searchAll() {
      // 3. SQL문장 작성 및 전송
      try {
         Statement stmt = conn.createStatement();
         String sql = "select * from DEPARTMENT order by DEPTNO";
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

   }// end  public void searchAll()
   
}// end class DepartmentManager


public class Main {

   public static void main(String[] args) {
      Connection conn = null;
      
      // 1. 드라이버 로딩
      // 1. JDBC 드라이버를 적재
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("드라이버 적재 성공");
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버를 찾을 수 없습니다. ");
      }
      System.out.println("2020-09-15 오후 4시 15분  ");

      // 2. 데이터베이스 연결
      String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
      String id = "s1701052";
      String password = "p1701052";

      try {
         conn = DriverManager.getConnection(url, id, password);
         System.out.println("연결 성공");
      } catch (SQLException e) {
         System.out.println("연결에 실패하였습니다.");
      }
      
      // 3. 쿼리 작성 및 전송
      String [] strName = new String[10];
      
      try {
         Statement stmt = conn.createStatement();
         String sql = "select * from DEPARTMENT order by DEPTNO";
         ResultSet rs = stmt.executeQuery(sql);
         System.out.println("쿼리를 요청하였습니다.");
         // 4. // 4. 결과 ResultSet을 이용하여 부서이름 저장(추가 변수 사용)
         // 결과 집합의 첫번째 레코드로 커서를 이동시킨다.
         
         for(int i = 0 ; i < 10 ; i++) {
             rs.next();
             System.out.println(rs.getInt("DEPTNO") + " : " + rs.getString("DEPTNAME") + " : " + rs.getInt("FLOOR"));
             strName[i] = rs.getString("DEPTNAME");
         }

         stmt.close();

      } catch (SQLException e) {
         System.out.println("예외가 발생하였습니다.");
      }
      
//-------------------------------------------------------------------------------
      
      // 버튼 생성
      JFrame f = new JFrame("1701052 김수환");
      f.setSize(300, 200);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
      f.setLayout(new FlowLayout());
      JButton button1 = new JButton("버튼");
      f.add(button1);
      button1.setText("김수환");
      
      for(int i = 0 ; i < 10 ; i++) {
          JButton button2 = new JButton("버튼");
          f.add(button2);
          button2.setText(strName[i]); // DEPTNAME 1
      }
      
      f.setVisible(true);

   }

}
