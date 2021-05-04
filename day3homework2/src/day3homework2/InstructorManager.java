package day3homework2;

public class InstructorManager
{
	
	
	
	void add(Instructor instructor) 

	{
		System.out.println("Eðitmen eklendi. " + instructor.name+" " +instructor.lastName);
	}

	void delete(Instructor instructor) 

	{
		System.out.println("Eðitmen silindi. "+instructor.name + " " +instructor.lastName);
	}
	void update(Instructor instructor) 
	{
		System.out.println("Eðitmen  güncellendi. "+instructor.name + " " +instructor.lastName);
	}
	void showInformation(Instructor instructor) 
	{
		System.out.println( "Eðitmen bilgileri : \n kullanýcý ýd : " +instructor.userId+" Ad :"+instructor.name +"\n"+
		" Soyad : " + instructor.lastName+ "\n"+ " Verdiði kurs adý : "+instructor.courseName+"\n" + " Yaþý : "+instructor.age
		+ "\n"+" Telefon numarasý : "+ instructor.phoneNumber +"\n"+ "Sahip olduðu eðitim serfitikalarý "+ 
		instructor.certificates+"\n");
	}
}
