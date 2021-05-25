package day5Homework.business.concretes;

import day5Homework.business.abstracts.MailVerificationService;


public class MailVerificationManager implements MailVerificationService
{
	
	private boolean verificationLink = false;
boolean ifIsVerificationLinkClicked()
{
	System.out.println("Kullanýcý doðrulama linkine týkladý . ");
	verificationLink = true;
	return verificationLink;
	
}



}

