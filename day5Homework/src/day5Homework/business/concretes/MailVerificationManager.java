package day5Homework.business.concretes;

import day5Homework.business.abstracts.MailVerificationService;


public class MailVerificationManager implements MailVerificationService
{
	
	private boolean verificationLink = false;
boolean ifIsVerificationLinkClicked()
{
	System.out.println("Kullan�c� do�rulama linkine t�klad� . ");
	verificationLink = true;
	return verificationLink;
	
}



}

