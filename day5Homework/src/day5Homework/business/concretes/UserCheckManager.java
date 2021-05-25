package day5Homework.business.concretes;

import day5Homework.business.abstracts.CheckService;
import day5Homework.entities.concretes.User;

public class UserCheckManager implements CheckService
{
 boolean nameCheck(User user)
 {
	 boolean ifIsProper = false;
	 int firstNameLength;
	 firstNameLength =user.getFirstName().length();
	 int lastNameLength;
	 lastNameLength =user.getFirstName().length();
	 
	 if ( (firstNameLength>=2) &&  (lastNameLength>=2) ) 
	 {
	   ifIsProper = true;
	
	 }
	 
	 return ifIsProper;
 }
	
 boolean passwordCheck(User user)
 {
	 boolean ifIsProper = false;
	 
	 int passwordLength;
	 passwordLength = user.getPassword().length();
	 
	 if (passwordLength >=6) 
	 {
		ifIsProper = true;
	 }
	 
	 return ifIsProper;
 }
 
}
