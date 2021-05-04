package day3homework2;

public class UserManager 
{
	void showInformation(User user) 
	{
		System.out.println( "Kullanýcý bilgileri : \n kullanýcý ýd : " +user.userId+"\n"+ " Ad :"+user.name +"\n"+
	" Soyad : " + user.lastName +"\n"+ " Eylemde bulunduðu kurs adý : "+user.courseName+ "\n"+ " Yaþý : "+user.age +"\n"
	+ " Telefon numarasý : "+ user.phoneNumber+ "\n");
			
	}
void add(User user) 

{
	System.out.println("Kullanýcý eklendi. ");
}

void delete(User user) 

{
	System.out.println("Kullanýcý silindi. ");
}
void update(User user) 
{
	System.out.println("Kullanýcý güncellendi. ");
}

void login(String username,String password)
{
	if (username=="Adil" && password == "123")
	{
	System.out.println("Tebrikler,baþarýlý bir þekilde giriþ yaptýnýz.");	
	}
	else 
	{
		System.out.println("Yanlýþ kullanýcý adý veya þifre,lütfen tekrar deneyiniz");	
	}
}

}

