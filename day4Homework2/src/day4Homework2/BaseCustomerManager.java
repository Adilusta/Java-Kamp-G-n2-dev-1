package day4Homework2;

public abstract class BaseCustomerManager implements ICustomerService
{
	public void save(Customer customer) 
	{
		System.out.println("Müþteri kaydedildi " + customer.firstName);
		
	}
}
