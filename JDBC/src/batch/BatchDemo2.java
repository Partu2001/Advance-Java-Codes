package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo2 {

	public static void main(String[] args) throws SQLException {
		
		 String url="jdbc:Oracle:thin:@localhost:1521:xe";
		 String uname="system";
		 String upass="system";
		 Connection con=null;
		 String query="insert into student values(?,?)";
		 int count=0;
		 
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,uname,upass);
			con.setAutoCommit(false);
			System.out.println("Connected...");
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 106);
			pstmt.setString(2, "PK");
			pstmt.addBatch();
			
			pstmt.setInt(1, 107);
			pstmt.setString(2, "PSK");
			pstmt.addBatch();
			
			pstmt.setInt(1, 108);
			pstmt.setString(2, "Barkyaa");
			pstmt.addBatch();
			
			pstmt.setInt(1, 109);
			pstmt.setString(2, "Kshitu");
			pstmt.addBatch();
			
			pstmt.setInt(1, 110);
			pstmt.setString(2, "Nitin");
			pstmt.addBatch();
			
			
			int r[]=pstmt.executeBatch();
			for(int i=0;i<r.length;i++) {
				count++;
			}
			System.out.println(count + "Data added");
			con.commit();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			con.rollback();
		}
		// TODO Auto-generated method stub
	}

}
