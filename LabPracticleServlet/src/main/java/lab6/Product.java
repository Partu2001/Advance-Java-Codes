package lab6;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Product() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Connection con=null;
		PreparedStatement pstmt=null;
		String url="jdbc:Oracle:thin:@localhost:1521:xe";
		String username="system";
		String userpass="system";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,username,userpass);
			pstmt=con.prepareStatement("select * from electronicproduct");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				out.println("<h1> Product Details : </h1>");
				out.println("<h1 style='background-color:green'>" +rs.getInt(1)+ " " +rs.getString(2)+ " " + rs.getInt(3) +"</h1>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
