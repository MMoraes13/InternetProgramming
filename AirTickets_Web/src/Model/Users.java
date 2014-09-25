package Model;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

import Utilities.PropertiesFileHandler;

public class Users {

	private User user;
	HashMap<String, User> listOfUsers;
	private File properties;
	private String pathToFile = "users.properties";
	Scanner sc;
	private FileWriter fw;
	PropertiesFileHandler p = null;

	public Users() {

		user = new User();
		
		p = new PropertiesFileHandler();
		
	}

	public boolean createUser(User user) {
		
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

	public User readUser(String username, String password) {

		user = listOfUsers.get(username);

		if (!user.equals(null) && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

}
