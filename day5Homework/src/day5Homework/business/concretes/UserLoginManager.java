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
	 System.out.println("Ba�ar�l� bir �ekilde giri� yap�ld�. ");
	}
	
	else 
	{
		System.out.println("Kullan�c� ad� veya parola yanl�� ");
		return;
	}
	
		
	}


}
