package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		int id=0;
		String name=null;
		String query="update student set name=? where id=?";
		
		try {
			con.setAutoCommit(false);
			System.out.println("Enter Id:");
			id=sc.nextInt();
			System.out.println("Enter Name:");
			name=sc.next();
			
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(2, id);
			pstmt.setString(1, name);
			int r=pstmt.executeUpdate();
			if(r>0) {
				System.out.println("Updated..");
				con.commit();
			}else {
				System.out.println("Update fail");
				con.rollback();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
