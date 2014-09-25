package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utilities.Html;

public class Registration extends HttpServlet {

	private User user;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Users us = new Users();
		
		user = new User(request.getParameter("username"), 
				 request.getParameter("password"));
		
		Html html = new Html("Registration page");
		
		if (us.createUser(user) == true) {
			
			response.sendRedirect("login.jsp");
			
		} else {
			System.out.println("ja existe");
		}
		
		
		

		 

		// response.sendRedirect("Login.jsp");

	}

}
