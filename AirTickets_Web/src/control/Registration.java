package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

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

		if (us.createUser(user) == true) {

			response.sendRedirect("login.jsp");

		} else {

			response.sendRedirect("login.jsp");
		}

	}

}
