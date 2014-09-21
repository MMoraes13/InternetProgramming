package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class ManageUsers {
	private User user;
	private HashMap <String, User> listOfUsers;
	private File properties; //Caminho relativo para leitura do arquivo
	private FileReader reader;
	//Usando Para dar o Commit
	public ManageUsers() {
		listOfUsers = new HashMap <String, User> ();
		user = new User ();
		properties = new File ("properties.file");
		try {
			reader = new FileReader (properties);
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
			listOfUsers.put(username, user);
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
