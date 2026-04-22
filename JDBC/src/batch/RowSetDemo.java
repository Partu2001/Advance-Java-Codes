package batch;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

	public static void main(String[] args) throws SQLException {
		
		JdbcRowSet jdbc=RowSetProvider.newFactory().createJdbcRowSet();
		jdbc.setUrl("jdbc:Oracle:thin:@localhost:1521:xe");
		jdbc.setUsername("system");
		jdbc.setPassword("system");
		System.out.println("Connected..");
		jdbc.setAutoCommit(false);
		
		
//		//Insert
//		jdbc.setCommand("insert into student values(?,?)");
//		jdbc.setInt(1, 110);
//		jdbc.setString(2, "Gojo");
//		jdbc.execute();
//		jdbc.commit();
//		System.out.println("Inserted...");
//		
		//Update 
		jdbc.setCommand("update student set name=? where id=?");
		jdbc.setString(1, "Jojo");
		jdbc.setInt(2, 110);
		jdbc.execute();
		System.out.println("Updated..");
		
		
		//Delete
		jdbc.setCommand("delete from student where id=?");
		jdbc.setInt(1, 110);
		jdbc.execute();
		System.out.println("Deleted...");
		
		//Fetch
		jdbc.setCommand("select id,name from student");
		jdbc.execute();
		while(jdbc.next()) {
			System.out.println(jdbc.getInt(1) + " "+jdbc.getString(2));
		}
		// TODO Auto-generated method stub

	}

}

