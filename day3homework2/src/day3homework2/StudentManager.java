package day3homework2;

public class StudentManager
{
		
	
	void add(Student student ) 

	{
		System.out.println("��renci eklendi. "+student.name+ " " +student.lastName);
	}

	void delete(Student student ) 

	{
		System.out.println("��renci silindi. "+student.name+ " " +student.lastName);
	}
	void update(Student student) 
	{
		System.out.println("��renci g�ncellendi. "+student.name +" " + student.lastName);
	}
	void showInformation(Student student) 
	{
		System.out.println
		( "��renci bilgileri : \n kullan�c� �d : " +student.userId+ "\n"+ "Ad : "+student.name +"\n"+
 " Soyad : " + student.lastName + "\n"+ " Kat�ld��� kurs ad� : "+student.courseName + "\n"+ " Ya�� : "+student.age+"\n"
	    + " Telefon numaras� : "+ student.phoneNumber + "\n"+" Okul ad� : " + student.schoolName+"\n"
	   + "��rencinin son s�navdan ald��� not : "+ student.finalExamGrade+"\n");
	}
}
