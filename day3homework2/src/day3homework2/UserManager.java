package day3homework2;

public class UserManager 
{
	void showInformation(User user) 
	{
		System.out.println( "Kullan�c� bilgileri : \n kullan�c� �d : " +user.userId+"\n"+ " Ad :"+user.name +"\n"+
	" Soyad : " + user.lastName +"\n"+ " Eylemde bulundu�u kurs ad� : "+user.courseName+ "\n"+ " Ya�� : "+user.age +"\n"
	+ " Telefon numaras� : "+ user.phoneNumber+ "\n");
			
	}
void add(User user) 

{
	System.out.println("Kullan�c� eklendi. ");
}

void delete(User user) 

{
	System.out.println("Kullan�c� silindi. ");
}
void update(User user) 
{
	System.out.println("Kullan�c� g�ncellendi. ");
}

void login(String username,String password)
{
	if (username=="Adil" && password == "123")
	{
	System.out.println("Tebrikler,ba�ar�l� bir �ekilde giri� yapt�n�z.");	
	}
	else 
	{
		System.out.println("Yanl�� kullan�c� ad� veya �ifre,l�tfen tekrar deneyiniz");	
	}
}

}

