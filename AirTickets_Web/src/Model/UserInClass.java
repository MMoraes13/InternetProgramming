package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class UserInClass {

	HashMap<String, String> userAndPassword;

	public UserInClass(String path) throws FileNotFoundException {

		userAndPassword = new HashMap<String, String>();

		String userFilePath = path + "\\WEB-INF\\classes\\users.properties";
		File file = new File(userFilePath);
		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);
		String s = "";
		// TODO read in the file and parse into userAndPassword

	}

	public boolean addUser(String user, String password) {

		String userExists = userAndPassword.get(user);

		String hashedPassword = ""; // hash password

		String existingPassword = userAndPassword.get(user);

		if (hashedPassword.equals(existingPassword)) {
			// success authentication
			return true;
		} else if (existingPassword == null) {
			return false;
		}

		if (userExists == null)
			userAndPassword.put(user, password);
		else
			return false;

		userAndPassword.put(user, password);

		return true;
	}

	public boolean verifyPassword(String user, String password) {

		String hashedPassword = "";

		String existingPassword = userAndPassword.get(user);

		if (hashedPassword.equals(existingPassword)) {
			// succcess authentication
			return true;
		} else
			return false;
	}

	public void save() {

	}
}
