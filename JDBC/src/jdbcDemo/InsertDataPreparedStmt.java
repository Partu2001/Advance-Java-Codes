package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDataPreparedStmt {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		
		String query="insert into student values(?,?)";
		System.out.println("Enter Id :");
		int id=sc.nextInt();
		
		System.out.println("Enter Name:");
		String name=sc.next();
		
		try {
		con.setAutoCommit(false);
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(2, name);
		pstmt.setInt(1, id);
		con.commit();
		System.out.println("Executed");
		}catch(SQLException e) {
			e.printStackTrace();
			con.rollback();	
		}
	    
		
	}

}
