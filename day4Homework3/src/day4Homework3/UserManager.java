package day4Homework3;


public class UserManager implements UserService
{
	UserCheckService userCheckManager;
public UserManager(UserCheckService userCheckManager)
{
	this.userCheckManager= userCheckManager;
}

   
	@Override
	public void add(User user) 
	{
		if (userCheckManager.ifIsRealPerson(user)) 
		{
			System.out.println("Kullan�c� eklendi : "+ user.getFirstName());
		}
		else 
		{
			System.out.println("Kullan�c� eklenemedi,kullan�c� bilgileri yanl�� : ");
		}
		
		
	}

	@Override
	public void update(User user) 
	{
		System.out.println("Kullan�c� g�ncellendi : "+ user.getFirstName());
		
	}

	@Override
	public void delete(User user) 
	{
		System.out.println("Kullan�c� silindi : "+ user.getFirstName());
		
	}

	@Override
	public void showInformation(User user) 
	{
		System.out.println("Kullan�c� bilgileri : \n "+user.getUserId()+" "+user.getFirstName()
		+ " "+ user.getLastName()+ " "+ user.getNationalityId()+ " "+ user.getYearOfBirth());
		
	}
	

}
