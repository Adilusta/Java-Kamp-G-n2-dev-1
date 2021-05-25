package day5Homework.business.concretes;

import day5Homework.business.abstracts.UserLoginSystem;
import day5Homework.entities.concretes.User;

public class UserLoginManager implements UserLoginSystem
{
	private String mail = "klambera@gmail.com";
	private String password = "123456";
	
	
	@Override
	public void login(User user)
	{
	if (user.getMail() == mail && user.getPassword()== password) 
	{
	 System.out.println("Baþarýlý bir þekilde giriþ yapýldý. ");
	}
	
	else 
	{
		System.out.println("Kullanýcý adý veya parola yanlýþ ");
		return;
	}
	
		
	}


}
