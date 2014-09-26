package control;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

import utilities.PropertiesFileHandler;
import model.User;

public class Users {

	private User user;
	private Scanner sc;
	private FileWriter fw;
	private PropertiesFileHandler p = null;

	public Users() {

		user = new User();

		p = new PropertiesFileHandler();

	}

	public boolean createUser(User user) {
		p = new PropertiesFileHandler();
		if (p.userExist(user) == false) {

			String hashedPassword = "";

			hashedPassword = "" + user.getPassword().hashCode();

			user.setPassword(hashedPassword);

			p.addUser(user);

			return true;

		} else {

			return false;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PropertiesFileHandler getP() {
		return p;
	}

	public void setP(PropertiesFileHandler p) {
		this.p = p;
	}
	

}
