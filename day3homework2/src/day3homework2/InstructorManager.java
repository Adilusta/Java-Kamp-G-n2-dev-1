package day3homework2;

public class InstructorManager
{
	
	
	
	void add(Instructor instructor) 

	{
		System.out.println("E�itmen eklendi. " + instructor.name+" " +instructor.lastName);
	}

	void delete(Instructor instructor) 

	{
		System.out.println("E�itmen silindi. "+instructor.name + " " +instructor.lastName);
	}
	void update(Instructor instructor) 
	{
		System.out.println("E�itmen  g�ncellendi. "+instructor.name + " " +instructor.lastName);
	}
	void showInformation(Instructor instructor) 
	{
		System.out.println( "E�itmen bilgileri : \n kullan�c� �d : " +instructor.userId+" Ad :"+instructor.name +"\n"+
		" Soyad : " + instructor.lastName+ "\n"+ " Verdi�i kurs ad� : "+instructor.courseName+"\n" + " Ya�� : "+instructor.age
		+ "\n"+" Telefon numaras� : "+ instructor.phoneNumber +"\n"+ "Sahip oldu�u e�itim serfitikalar� "+ 
		instructor.certificates+"\n");
	}
}
