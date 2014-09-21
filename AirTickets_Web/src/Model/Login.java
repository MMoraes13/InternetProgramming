package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login  extends HttpServlet {
	private String LOGIN_SUCCESSFUL = "login_success";
	private String LOGIN_UNSUCCESFUL = "login_unsucess";
	private User user;
	private HashMap <String, User> listOfUsers;
	
	 
	public void doGet(HttpServletRequest request,  HttpServletResponse response) 
			throws ServletException, IOException { 
		 doPost (request, response);
	 }
	public void doPost (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int hashedPassword = request.getParameter("password").hashCode();
		if (login (request.getParameter ("username"), hashedPassword).equals(LOGIN_SUCCESSFUL)) {
			PrintWriter out = response.getWriter(); 
			out.println("Hello, "+user.getName()); 
		}
		
	}
	
	
	public String login (String username, int password) {
		Users manageUser = new Users();
		user = manageUser.readUser(username, password);
		if (!user.equals(null)) {
			return LOGIN_SUCCESSFUL;
		}
		return LOGIN_UNSUCCESFUL;
	}
	
}
