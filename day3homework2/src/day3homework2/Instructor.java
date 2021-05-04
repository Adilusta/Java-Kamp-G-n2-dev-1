package day3homework2;

public class Instructor extends User
{
	String certificates;
	
	
	
	public Instructor(int userId, String name, String lastName, String courseName,
			String age, String phoneNumber,String certificates)
			 
	{
		
		super(userId, name, lastName, courseName, age, phoneNumber);
		this.certificates = certificates;
	}

	
	

}
