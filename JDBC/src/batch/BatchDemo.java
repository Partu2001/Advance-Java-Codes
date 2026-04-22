package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) throws SQLException {
		
		 String url="jdbc:Oracle:thin:@localhost:1521:xe";
		 String uname="system";
		 String upass="system";
		 Connection con=null;
		 int count=0;
		 
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection( url,uname,upass);
			con.setAutoCommit(false);
			System.out.println("Connected....");
			Statement stmt=con.createStatement();
			
			stmt.addBatch("insert into student values(101,'Partu')");
			stmt.addBatch("insert into student values(102,'Pratik')");
			stmt.addBatch("insert into student values(103,'Prathamesh')");
			stmt.addBatch("insert into student values(104,'Vinit')");
			stmt.addBatch("insert into student values(105,'Tush')");
			
			int r[]=stmt.executeBatch();
			for(int i=0;i<r.length;i++) {
				count++;
			}
			System.out.println(count + "Data added...");
			con.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			con.rollback();
		}
		
		// TODO Auto-generated method stub

	}

}
