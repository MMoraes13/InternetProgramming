package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import Model.User;

public class PropertiesFileHandler {

	public Properties p;
	FileInputStream fis = null;
	String propFilePath = "/Users/lucas/git/InternetProgramming/AirTickets_Web/src/Model/users.properties";
	
	public PropertiesFileHandler() {

		p = new Properties();

		try {

			fis = new FileInputStream(propFilePath);

			p.load(fis);

		} catch (FileNotFoundException e) {

			System.out.println("FileNotFound");

		} catch (IOException e) {

			System.out.println("IOEXCeption");

		} finally {

			if (null != fis) {

				try {

					fis.close();

				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		}
	}

	public boolean userExist(User user) {

		boolean exists = false;

		String pass = p.getProperty(user.getName());

		if (pass == null)
			exists = false;
		else {
			
			String hashedPwd = "" + user.getPassword().hashCode();
			user.setPassword(hashedPwd);
			
			if(pass.equals(user.getPassword()))
				exists = true;
			
		}

		return exists;

	}

	public void addUser(User user) {

		p.setProperty(user.getName(), user.getPassword());

		try {

			p.store(new FileOutputStream(propFilePath), null);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

	public void printUsers() {

		Enumeration<?> e = p.propertyNames();
		String username = null;
		String pwd = null;

		while (e.hasMoreElements()) {
			username = (String) e.nextElement();
			pwd = p.getProperty(username);

			System.out.println(username + ":" + pwd);
		}

	}

}
