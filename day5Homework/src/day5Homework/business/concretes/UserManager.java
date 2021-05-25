package day5Homework.business.concretes;


import day5Homework.GoogleAccountSystem.GoogleAccountManager;
import day5Homework.business.abstracts.CheckService;
import day5Homework.business.abstracts.UserService;
import day5Homework.core.concretes.GoogleAccountAdapter;
import day5Homework.entities.concretes.User;

public class UserManager implements UserService
{
	
	private UserCheckManager userCheckManager;
	private MailCheckManager mailCheckManager;
	private MailVerificationManager	mailVerificationManager;
	
	private GoogleAccountAdapter googleAccountAdapter;
	
	public UserManager(GoogleAccountAdapter googleAccountAdapter) 
	{
	this.googleAccountAdapter = googleAccountAdapter;
	}
	
	
	
	
public UserManager(UserCheckManager usercheckmanager , MailCheckManager mailCheckManager,
		MailVerificationManager	mailVerificationManager) 
{
this.userCheckManager = usercheckmanager;
this.mailCheckManager = mailCheckManager;
this.mailVerificationManager = mailVerificationManager;
}




@Override
public void addGoogleUser(GoogleAccountAdapter googleAccountAdapter)
{
	googleAccountAdapter.registerToSystem();
	
}



	
	@Override
	public void addUser(User user)
	{
     if (userCheckManager.nameCheck(user) && userCheckManager.passwordCheck(user) && 
    		 mailCheckManager.isEmailValid(user.getMail())  ) 
    		 
     {
		System.out.println("Doðrulama e-postasý gönderildi. ");
    	 mailVerificationManager.ifIsVerificationLinkClicked();
    	 
    	 System.out.println("Kullanýcý eklendi. ");
	 }
     
     else 
     {
		System.out.println("Kullanýcý eklenemedi bilgilerde hata var");
		return ;
	 }
     
     
     
     
	}






}
