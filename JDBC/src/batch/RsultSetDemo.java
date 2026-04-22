package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RsultSetDemo {

	public static void main(String[] args) throws SQLException {
		
		 String url="jdbc:Oracle:thin:@localhost:1521:xe";
		 String uname="system";
		 String upass="system";
		 Connection con=null;
		 String query="select id,name from student";
		 
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,uname,upass);
			System.out.println("Connected..");
			
			PreparedStatement pstmt=con.prepareCall(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=pstmt.executeQuery();
			
			System.out.println("Forword Direction..");
			while(rs.next()) {
				System.out.println(rs.getInt(1) +" " +rs.getString(2));
			}
			
			System.out.println("Backword Direction");
			while(rs.previous()) {
				System.out.println(rs.getString(2) + " " +rs.getInt(1));
			}
			
//		System.out.println("Insert..");
//		rs.moveToInsertRow();
//		rs.updateInt(1, 111);
//		rs.updateString(2,"Gojo" );
//		rs.insertRow();
//		System.out.println("Row inserted...");
//		
//      	System.out.println("Update");
//		rs.absolute(11);
//		System.out.println(rs.getInt(1)+ " " +rs.getString(2));
//		rs.updateString(2,"Jojo");
//		System.out.println("Updated..");
//		System.out.println(rs.getInt(1)+ " " +rs.getString(2));
		
		System.out.println("Delete");
		rs.absolute(5);
		rs.deleteRow();
		System.out.println("Deleted..");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) +" " +rs.getString(2));
		}
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
