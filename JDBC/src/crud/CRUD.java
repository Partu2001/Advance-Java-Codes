package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbcDemo.DBConnection;

public class CRUD {
	
	public void InsertData() throws SQLException{
		Scanner sc=new Scanner(System.in);
		Connection con=Connectivity.getConnection();
		con.setAutoCommit(false);
		String query="insert into Employee values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(query);
		
		System.out.println("Enter  ID:");
		int id=sc.nextInt();
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setDouble(3, salary);
		
		pstmt.execute();
		
		con.commit();
		System.out.println("Data inserted....");
	}
		
		
	
		public void UpdateData() {
			
			Scanner sc=new Scanner(System.in);
			Connection con=Connectivity.getConnection();
			int id=0;
			String name=null;
			String query="update Employee set name=? where id=?";
			
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
	
		
		public void DeleteData() throws SQLException {
			Scanner sc=new Scanner(System.in);
			Connection con=Connectivity.getConnection();
			con.setAutoCommit(false);
			String query="delete from Employee where id=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			
			pstmt.setInt(1,id);
			pstmt.execute();
			con.commit();
			System.out.println("Deleted....");
		}
		
		
		public void FetchData() {
			String query="select * from Employee";
			Connection con=Connectivity.getConnection();
			
			try {
				PreparedStatement pstmt=con.prepareStatement(query);
				ResultSet rs=pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " +rs.getDouble(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public void Search() {
			Scanner sc=new Scanner(System.in);
			String query="select * from Employee where id=?";
			Connection con=Connectivity.getConnection();
			
			try {
				PreparedStatement pstmt=con.prepareStatement(query);
				System.out.println("Enter id:");
				int id=sc.nextInt();
				pstmt.setInt(1, id);
				ResultSet rs=pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " +rs.getDouble(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
			
		
	


