package Model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login  extends HttpServlet {
	private String LOGIN_SUCCESSFUL = "login_success";
	private String LOGIN_UNSUCCESFUL = "login_unsucess";
	User user;
	Users us;
	
	public void doGet(HttpServletRequest request,  HttpServletResponse response) 
			throws ServletException, IOException { 
		 doPost (request, response);
	 }
	public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		user = new User(request.getParameter("username"), 
				 request.getParameter("password"));
		
		us = new Users();
		
		if (us.p.userExist(user) == true) {
			
			response.sendRedirect("flightSearch.jsp");
			
		} else {
			response.sendRedirect("Registration");
		}
		
	}
	
}
