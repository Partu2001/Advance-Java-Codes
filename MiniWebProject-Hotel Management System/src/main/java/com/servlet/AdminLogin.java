package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();

         String uname = request.getParameter("username");
         String pass = request.getParameter("password");

        if ("Admin123".equals(uname) && "Admin@123".equals(pass)) {
            response.sendRedirect("Admin.jsp");

        } else { 
            out.println( "<h2 style='color:red; text-align:center;'>Invalid Username or Password</h2>" +
                "<div style='text-align:center;'><a href='login.jsp'>Try Again</a></div>"
            );
        }
    }
	}


