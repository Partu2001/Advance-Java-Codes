package project;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class From
 */
@WebServlet("/From")
public class From extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public From() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		out.println("Name:" +name +"<br>");
		String email=request.getParameter("email");
		out.println("Email :" +email +"<br>");
		int contact=Integer.parseInt(request.getParameter("contact"));
		out.println("Contact :" +contact +"<br>");
		String gender=request.getParameter("gender");
		out.println("Gender:" +gender +"<br>");
		String city=request.getParameter("city");
		out.println("City:" +city +"<br>");
		String subject[]=request.getParameterValues("subject");
			for(int i=0;i<subject.length;i++) {
				out.println("Subjects:" +subject[i] +"<br>");
			}
	}

}
