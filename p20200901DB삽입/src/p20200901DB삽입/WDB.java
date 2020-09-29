package p20200901DB����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class WDB {
	public static void main(String[] args) {
	// DB ������ ���� base �ڵ�
		
		// 1. JDBC ����̹��� ����
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("����̹� ���� ����");
			} catch (ClassNotFoundException e) {
				System.out.println("����̹��� ã�� �� �����ϴ�.");
			}
			
			System.out.println("ù��° �׽�Ʈ");
			
//----------------------------------------------------------------------------------	
			
		// 2. DB ����
			String url		= "jdnc:oracle:thin:@net.yju.ac.kr:1521:orcl";	// oracle DB ������ ���� url
			String id 		= "s1701052";									// oracle DB ������ ���� ���̵�
			String password = "p1701052";									// oracle DB ������ ���� �н�����
			Connection con 	= null;
			
			try {
				con = DriverManager.getConnection(url , id, password);
				System.out.println("���� ����");
			} catch (SQLException e) {
				System.out.println("���� ����");
			}
			
			System.out.println("�ι�° �׽�Ʈ");

//----------------------------------------------------------------------------------
			
		// 3. SQL���� �ۼ� �� ����
			try {
				Statement stmt = con.createStatement();
				String sql = null;
				
			// DEPARTMENT ���̺��� DEPTNO�������� ������������ �����Ͽ� ��ȸ�Ѵ�.
			//sql = "select * from DEPARTMENT order by DEPTNO";
				
			/* <NOTE>
			 * select���� �Ҷ��� executeQuery �޼ҵ� ����Ѵ�.
			 * ResultSet rs = stmt.executeQuery(sql);
			 * insert���� ����ϸ� executeUpdate �޼ҵ� ����Ѵ�.
			 */
				
			int a = stmt.executeUpdate(sql);
				
			System.out.println("������ ��û�Ͽ����ϴ�." + a);
				
			stmt.close();	
			con.close();	
			
			} catch (SQLException e) {
				System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
				}

			
	}// end main
	
}// end class WDB
