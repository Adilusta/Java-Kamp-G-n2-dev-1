package day3homework2;

public class StudentManager
{
		
	
	void add(Student student ) 

	{
		System.out.println("Öðrenci eklendi. "+student.name+ " " +student.lastName);
	}

	void delete(Student student ) 

	{
		System.out.println("Öðrenci silindi. "+student.name+ " " +student.lastName);
	}
	void update(Student student) 
	{
		System.out.println("Öðrenci güncellendi. "+student.name +" " + student.lastName);
	}
	void showInformation(Student student) 
	{
		System.out.println
		( "Öðrenci bilgileri : \n kullanýcý ýd : " +student.userId+ "\n"+ "Ad : "+student.name +"\n"+
 " Soyad : " + student.lastName + "\n"+ " Katýldýðý kurs adý : "+student.courseName + "\n"+ " Yaþý : "+student.age+"\n"
	    + " Telefon numarasý : "+ student.phoneNumber + "\n"+" Okul adý : " + student.schoolName+"\n"
	   + "Öðrencinin son sýnavdan aldýðý not : "+ student.finalExamGrade+"\n");
	}
}
