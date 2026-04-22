package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PaymentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String method = request.getParameter("method");
        String pass = request.getParameter("pass");

        if (pass == null || pass.isEmpty()) {
            out.println("<h2 style='color:red;text-align:center;'>Payment Failed: Password Required</h2>");
            return;
        }
        else {

        out.println("<html><body>");
        out.println("<div style='text-align:center;margin-top:100px;'>");
        out.println("<h1 style='color:green;'>Payment Successful 🎉</h1>");
        out.println("<h3>Payment Method: " + method + "</h3>");
        out.println("<a href='Dashboard.jsp' style='padding:10px 20px;background:#4CAF50;color:white;text-decoration:none;border-radius:5px;'>Go Back</a>");
        out.println("</div>");
        out.println("</body></html>");
    }
  }
}


