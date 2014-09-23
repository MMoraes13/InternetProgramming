package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {

	private User user;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Users us = new Users();
		
		user = new User(request.getParameter("name"), 
				 request.getParameter("password"));
		
		if (us.createUser(user.getName(), user.getPassword()) == true) {
			//TODO criar Utilities
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String title = "Using GET Method to Read Form Data";
			String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
			for (Entry<String, User> entry : us.listOfUsers.entrySet()) {
				out.println(entry.getKey() + "/n");
			}
			out.println("funcionou" + 
			"</body></html>");
		}
		
		
		

		 

		// response.sendRedirect("Login.jsp");

	}

}
