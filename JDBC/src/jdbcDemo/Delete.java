package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		con.setAutoCommit(false);
		String query="delete from student where id=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		
		pstmt.setInt(1,id);
		pstmt.execute();
		con.commit();
		System.out.println("Deleted....");
		// TODO Auto-generated method stub

	}

}
