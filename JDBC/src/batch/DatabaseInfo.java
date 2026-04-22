package batch;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseInfo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 String url="jdbc:Oracle:thin:@localhost:1521:xe";
		 String uname="system";
		 String upass="system";
		 
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection(url,uname,upass);
		 
		 DatabaseMetaData data=con.getMetaData();
		 System.out.println(data.getDatabaseProductName());
		 System.out.println(data.getDatabaseProductVersion());
		// TODO Auto-generated method stub

	}

}

