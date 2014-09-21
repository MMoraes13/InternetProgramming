package Model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet{
	private User user;
	public void doGet(HttpServletRequest request,  HttpServletResponse response) 
			throws ServletException, IOException { 
		 doPost (request, response);
	 }
	public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		user = new User();
		user.setName(request.getParameter ("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(Integer.parseInt(request.getParameter("password")));
		response.sendRedirect("Login.jsp");
	}
	
}
