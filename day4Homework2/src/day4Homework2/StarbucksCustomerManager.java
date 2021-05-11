package day4Homework2;

public class StarbucksCustomerManager extends BaseCustomerManager 
{
	
	ICustomerCheckService iCustomerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService)
	{
		this.iCustomerCheckService = iCustomerCheckService;
	}
	
  @Override
  public void save(Customer customer)
  {
	  if (iCustomerCheckService.CheckIfRealPerson(customer)) 
	  {
		  super.save(customer);
		 
	  }
	  else 
	  {
		System.out.println("Geçerli bir kiþi deðil");
	  }
	  
	 
	
  }



}
