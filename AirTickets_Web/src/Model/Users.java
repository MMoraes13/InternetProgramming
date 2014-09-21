package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.scenario.effect.LinearConvolveCoreEffect;

public class Users {
	private User user;
	private HashMap <String, User> listOfUsers;
	private File properties; 
	Scanner sc;
	public Users() {
		listOfUsers = new HashMap <String, User> ();
		user = new User ();
		
		try {
			properties = new File ("user.properties");
			sc = new Scanner (new FileReader (properties)).useDelimiter("\n");
			while (sc.hasNext()) {
				String [] campos = sc.next().replace("=", " ").split("=");
				user.setEmail(campos[0]);
				user.setPassword(Integer.parseInt(campos[1]));
				listOfUsers.put(user.getEmail(), user);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TODO buscar usuarios no arquivo para colocar na listOfUsers
	}
	public void createUser (String username, int password, String email) {
		if (!listOfUsers.get(username).equals((null))) { //Username 
			user.setName(username);
			user.setEmail(email);
			user.setPassword (password);
			listOfUsers.put(email, user);
			//Inserir no Arquivo
		}
		else {
			//Usuario ja existe.
		}
	}
	public User readUser (String username, int password) {
		user = listOfUsers.get(username);
		if (!user.equals(null) && user.getPassword() == password) {
			return user;
		}
		return null;
	}

}
