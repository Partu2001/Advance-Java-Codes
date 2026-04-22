package servlet;

import jakarta.servlet.RequestDispatcher;
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

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		Connection con=null;
		PreparedStatement pstmt=null;
		String url="jdbc:Oracle:thin:@localhost:1521:xe";
		String username="system";
		String userpass="system";
		String name=request.getParameter("book");
		
       try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url,username,userpass);
		pstmt=con.prepareStatement("select *from bookinfo where booktitle=?");
		pstmt.setString(1, name);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " +rs.getInt(4)+ " " +rs.getString(5));
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
       
		
	}

}
