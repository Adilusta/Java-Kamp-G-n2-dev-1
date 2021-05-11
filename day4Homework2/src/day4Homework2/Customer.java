package day4Homework2;

import java.util.Date;

public class Customer implements IEntity
{
	String nationalityId;
	   String firstName;
	   String lastName;
	   
	   Date dateOfBirth;
	   
	   public Customer(String nationalityId, String firstName,String lastName, Date dateOfBirth) 
		{
			
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationalityId = nationalityId;
			this.dateOfBirth = dateOfBirth;
		}
	   

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	   
	   
}
