package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {

	public static void main(String[] args) {
		String query="select * from student";
		Connection con=DBConnection.getConnection();
		
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
