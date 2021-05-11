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
			System.out.println("Kullanýcý eklendi : "+ user.getFirstName());
		}
		else 
		{
			System.out.println("Kullanýcý eklenemedi,kullanýcý bilgileri yanlýþ : ");
		}
		
		
	}

	@Override
	public void update(User user) 
	{
		System.out.println("Kullanýcý güncellendi : "+ user.getFirstName());
		
	}

	@Override
	public void delete(User user) 
	{
		System.out.println("Kullanýcý silindi : "+ user.getFirstName());
		
	}

	@Override
	public void showInformation(User user) 
	{
		System.out.println("Kullanýcý bilgileri : \n "+user.getUserId()+" "+user.getFirstName()
		+ " "+ user.getLastName()+ " "+ user.getNationalityId()+ " "+ user.getYearOfBirth());
		
	}
	

}
