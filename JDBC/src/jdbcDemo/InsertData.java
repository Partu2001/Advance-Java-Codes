package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="system";
		String upass="system";
		String query=null;
		Connection con=null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url,uname,upass);
		con.setAutoCommit(false);
		System.out.println("Connected..");
		
		System.out.println("Enter Id:");
		id=sc.nextInt();
		
		System.out.println("Enter Name:");
		name=sc.next();
		
		Statement stmt=con.createStatement();
		query="insert into student values(" +id+", '" +name + "')";
		
		int r=stmt.executeUpdate(query);
		if(r>0) {
			System.out.println("Inerted..");
			con.commit();
		}else {
			System.out.println("Inertion failed..");
			con.rollback();
		}
		

	}

}
