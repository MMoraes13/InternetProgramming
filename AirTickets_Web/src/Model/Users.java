package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import Model.User;

public class Users {
	
	private User user;
	HashMap<String, User> listOfUsers;
	private File properties;
	private String pathToFile = "../AirTickets_Web/src/Model/users.properties";
	Scanner sc;
	private FileWriter fw;

	public Users() {

		listOfUsers = new HashMap<String, User>();
		user = new User();

		try {
			properties = new File(pathToFile);
			sc = new Scanner(new FileReader(properties)).useDelimiter("\n");

			while (sc.hasNext()) {
				String[] campos = sc.next().replace("=", " ").split("=");
				user.setName(campos[0]);
				user.setPassword(campos[1]);
				listOfUsers.put(user.getName(), user);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public boolean createUser(String username, String password) {

		if (listOfUsers.get(username) != null) {
			
			String hashedPassword = "";
			
			hashedPassword = "" + password.hashCode();
			
			user.setName(username);
			user.setPassword(hashedPassword);
			
			listOfUsers.put(username, user);
			
			try {
				fw = new FileWriter(properties.getPath(), true);
				fw.append(user.getName() + ":" + user.getPassword());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
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
