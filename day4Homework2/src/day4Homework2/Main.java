package day4Homework2;

import java.util.Date;

public class Main {

	public static void main(String[] args) 
	{
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer("12749631448","Adil", "Usta",  new Date(2001,5,6)));
		
		
			
		
		
	  
	  

	}

}
