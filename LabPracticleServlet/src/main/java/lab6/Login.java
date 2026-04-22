package lab6;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Connection con=null;
		PreparedStatement pstmt=null;
		String url="jdbc:Oracle:thin:@localhost:1521:xe";
		String username="system";
		String userpass="system";
		String uname=request.getParameter("username");
		String upass=request.getParameter("password");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,username,userpass);
			pstmt=con.prepareStatement("select * from userinfo where username=? and password=?");
			pstmt.setString(1, uname);
			pstmt.setString(2, upass);
	
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd=request.getRequestDispatcher("Product");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd=request.getRequestDispatcher("Invalid.html");
				rd.include(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

}
