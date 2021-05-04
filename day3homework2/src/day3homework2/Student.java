package day3homework2;

public class Student extends User
{
	
 String schoolName;
 int finalExamGrade;
 
 public Student(int userId, String name, String lastName, String courseName, String age,
		 String phoneNumber,String schoolName,int finalExamGrade)
 {
	super(userId, name, lastName, courseName, age, phoneNumber);
	this.schoolName=schoolName;
	this.finalExamGrade = finalExamGrade;

 }
 
}
