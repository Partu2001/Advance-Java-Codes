package project;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginForm() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if("admin".equals(username) && "admin".equals(password)) {
//			RequestDispatcher rd=request.getRequestDispatcher("Welcome.html");
//			rd.forward(request, response);
			
			response.sendRedirect("Welcome.html");
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("LoginForm.html");
			out.println("<h1 style='color:red'>Login Failed.. </h1>");
			rd.include(request, response);
		}
	}

}
