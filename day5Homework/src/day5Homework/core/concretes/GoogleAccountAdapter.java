package day5Homework.core.concretes;

import day5Homework.GoogleAccountSystem.GoogleAccountManager;
import day5Homework.core.abstracts.GoogleService;

public class GoogleAccountAdapter implements GoogleService
{
public void registerToSystem() 
{
GoogleAccountManager googleAccountManager = new GoogleAccountManager();
googleAccountManager.registerGoogleAccount();
}



}
	

