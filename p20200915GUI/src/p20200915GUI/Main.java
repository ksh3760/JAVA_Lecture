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
      // 1. JDBC ����̹��� ����
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("����̹� ���� ����");
      } catch (ClassNotFoundException e) {
         System.out.println("����̹��� ã�� �� �����ϴ�. ");
      }
      System.out.println("2020-09-08 ���� 2�� 35��  ");

      // 2. �����ͺ��̽� ����

      String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
      String id = "s1701052";
      String password = "p1701052";

      try {
         conn = DriverManager.getConnection(url, id, password);
         System.out.println("���� ����");
      } catch (SQLException e) {
         System.out.println("���ῡ �����Ͽ����ϴ�.");
      }
      
      System.out.println("2020-09-08 ���� 2�� 37��  ");
      
   }// end void connect()

   // Department ���̺��� ��� ���� ��ȸ�ϴ� �޼ҵ�
   public void searchAll() {
      // 3. SQL���� �ۼ� �� ����
      try {
         Statement stmt = conn.createStatement();
         String sql = "select * from DEPARTMENT order by DEPTNO";
         ResultSet rs = stmt.executeQuery(sql);
         System.out.println("������ ��û�Ͽ����ϴ�.");
         // 4. ������� ��� �� ���� ����
         // ��� ������ ù��° ���ڵ�� Ŀ���� �̵���Ų��.
         while (rs.next()) {
            System.out.println(rs.getInt("DEPTNO") + " : " + rs.getString("DEPTNAME") + " : " + rs.getInt("FLOOR"));
         }

         stmt.close();

      } catch (SQLException e) {
         System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
      }

   }// end  public void searchAll()
   
}// end class DepartmentManager


public class Main {

   public static void main(String[] args) {
      Connection conn = null;
      
      // 1. ����̹� �ε�
      // 1. JDBC ����̹��� ����
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("����̹� ���� ����");
      } catch (ClassNotFoundException e) {
         System.out.println("����̹��� ã�� �� �����ϴ�. ");
      }
      System.out.println("2020-09-15 ���� 4�� 15��  ");

      // 2. �����ͺ��̽� ����
      String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
      String id = "s1701052";
      String password = "p1701052";

      try {
         conn = DriverManager.getConnection(url, id, password);
         System.out.println("���� ����");
      } catch (SQLException e) {
         System.out.println("���ῡ �����Ͽ����ϴ�.");
      }
      
      // 3. ���� �ۼ� �� ����
      String [] strName = new String[10];
      
      try {
         Statement stmt = conn.createStatement();
         String sql = "select * from DEPARTMENT order by DEPTNO";
         ResultSet rs = stmt.executeQuery(sql);
         System.out.println("������ ��û�Ͽ����ϴ�.");
         // 4. // 4. ��� ResultSet�� �̿��Ͽ� �μ��̸� ����(�߰� ���� ���)
         // ��� ������ ù��° ���ڵ�� Ŀ���� �̵���Ų��.
         
         for(int i = 0 ; i < 10 ; i++) {
             rs.next();
             System.out.println(rs.getInt("DEPTNO") + " : " + rs.getString("DEPTNAME") + " : " + rs.getInt("FLOOR"));
             strName[i] = rs.getString("DEPTNAME");
         }

         stmt.close();

      } catch (SQLException e) {
         System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
      }
      
//-------------------------------------------------------------------------------
      
      // ��ư ����
      JFrame f = new JFrame("1701052 ���ȯ");
      f.setSize(300, 200);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
      f.setLayout(new FlowLayout());
      JButton button1 = new JButton("��ư");
      f.add(button1);
      button1.setText("���ȯ");
      
      for(int i = 0 ; i < 10 ; i++) {
          JButton button2 = new JButton("��ư");
          f.add(button2);
          button2.setText(strName[i]); // DEPTNAME 1
      }
      
      f.setVisible(true);

   }

}
