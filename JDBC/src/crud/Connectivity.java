package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
	
	static String url="jdbc:Oracle:thin:@localhost:1521:xe";
	static String uname="system";
	static String upass="system";
	static Connection con=null;
	
	 static Connection getConnection() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url,uname,upass);
	}catch (ClassNotFoundException | SQLException e){
		e.printStackTrace();
	}
	return con;

}
}


