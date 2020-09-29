package p20200908�ڹټ���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class DepartmentManager {
   Connection conn = null;

	  void connect() {
	    // 1. JDBC ����̹��� ����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		}
		
		System.out.println("ù��° �׽�Ʈ");
	
	  // 2. �����ͺ��̽� ����
		String url		= "jdnc:oracle:thin:@net.yju.ac.kr:1521:orcl";
		String id 		= "s1701052";								
		String password = "p1701052";								
		Connection conn 	= null;
		
		try {
			conn = DriverManager.getConnection(url , id, password);
			System.out.println("���� ����");
		} catch (SQLException e) {
			System.out.println("���� ����");
		}
		
		System.out.println("�ι�° �׽�Ʈ");
	      
	}// end void connect()
 
// ------------------------------------------------------------------------------------

   // SQL���� �Է¹޾� DB�� ó���ϴ� �޼ҵ�
   void insert(String sql) {
      try {
         Statement stmt = conn.createStatement();
         int n = stmt.executeUpdate(sql);
         System.out.println(n + "���� ���� ���ԵǾ����ϴ�.");
         stmt.close();
      } catch (SQLException e) {
	         e.printStackTrace();
	      }

   }// end void insert
      
   
   // Department ���̺��� ��� ���� ��ȸ�ϴ� �޼ҵ�
   public void searchAll() {
      // 3. SQL���� �ۼ� �� ����
      try {
         Statement stmt = conn.createStatement();
         String sql = "select * from DEPARTMENT";
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

   }// end public void searchAll()

   
   // �μ���ȣ no �� �ָ� �ش� ���ڵ带 ����
   public void delete(int no) {
      try {
         String sql = "delete DEPARTMENT where DEPTNO =" + no;
         Statement stmt = conn.createStatement();
         int n = stmt.executeUpdate(sql);
         System.out.println(n + "���� ���� �����Ǿ����ϴ�.");
         stmt.close();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }// end public void delete()
   

   // �μ��̸��� �Ϻη� �˻� ( "��" �̶�� �Է��ϸ� �ѹ� �μ� ���ڵ� ��� )
   public void search(String bName) {
	      try {
	          Statement stmt = conn.createStatement();
	          String sql = "select * from DEPARTMENT where ";
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
	         System.out.println("*�޴��� �Է� 1: ����, 2 : �̸��˻�, 3: ����, 4:��ü��ȸ , 9:����*");
	         int data = input.nextInt();
	         
	         switch (data) {
	         case 1: // ����
	            System.out.print("�μ���ȣ �Է� : ");
	            int no = input.nextInt();
	            System.out.print("�μ��� �Է� : ");
	            String name = input.next();
	            System.out.print("�� �Է� : ");
	            int floor = input.nextInt();
	            // �Է¹��� �����͸� �̿��Ͽ� SQL�� �����Ѵ�.
	            // insert into DEPARTMENT(DEPTNO, DEPTNAME, FLOOR) values( 1,
	            // '����',
	            // 3)
	            String sql = "insert into DEPARTMENT(DEPTNO, DEPTNAME, FLOOR) values( ";
	            sql = sql + no + ", '" + name + "', " + floor + ")";
	            System.out.println(sql);
	            // �۾�.
	            manager.insert(sql);
	            break;
	            
	         case 2: // �μ��̸��� �Ϻη� �˻� ( "��" �̶�� �Է��ϸ� �ѹ� �μ� ���ڵ� ��� )
		            String bName = input.next();
		            manager.search(bName);
		            break;   
		            
	         case 3: // �μ���ȣ�� �ָ� �ش� ���ڵ带 ����
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
