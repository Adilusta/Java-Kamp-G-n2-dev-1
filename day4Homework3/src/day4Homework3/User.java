package day4Homework3;

public class User extends UserManager implements Entities
{
	private int userId;
	private	String nationalityId;
	private	String firstName;
	private String lastName;
	int yearOfBirth;
	public User(UserCheckManager userCheckManager,int userId, String nationalityId, String firstName, String lastName, int yearOfBirth) 
	{
		super(userCheckManager);
		this.userId = userId;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}
	
	public int getUserId() 
	{
		return userId;
	}
	
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	
	public String getNationalityId() 
	{
		return nationalityId;
	}
	
	public void setNationalityId(String nationalityId) 
	{
		this.nationalityId = nationalityId;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public int getYearOfBirth() 
	{
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) 
	{
		this.yearOfBirth = yearOfBirth;
	}
	 
}
