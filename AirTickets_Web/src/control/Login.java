package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

public class Login extends HttpServlet {
	private User user;
	private Users us;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		user = new User(request.getParameter("username"),
				request.getParameter("password"));

		us = new Users();

		if (us.getP().userExist(user) == true) {

			response.sendRedirect("flightsearchquery.jsp");

		} else {
			response.sendRedirect("registration.jsp");
		}

	}

}
