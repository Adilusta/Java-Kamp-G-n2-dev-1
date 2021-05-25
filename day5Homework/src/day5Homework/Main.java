package day5Homework;

import java.util.ArrayList;

import day5Homework.business.abstracts.UserService;
import day5Homework.business.concretes.MailCheckManager;
import day5Homework.business.concretes.MailVerificationManager;
import day5Homework.business.concretes.UserCheckManager;
import day5Homework.business.concretes.UserLoginManager;
import day5Homework.business.concretes.UserManager;
import day5Homework.core.concretes.GoogleAccountAdapter;
import day5Homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) 
	{
	User user = new User("Adil", "Usta", "klambera@gmail.com", "123456");
	UserService userManager =new UserManager(new UserCheckManager(), new MailCheckManager() , new MailVerificationManager());
	
	userManager.addGoogleUser(new GoogleAccountAdapter());
	
	UserLoginManager userLoginManager = new UserLoginManager();
	userLoginManager.login(user);
	
	//userManager.addUser(user); 
		

	}

}
