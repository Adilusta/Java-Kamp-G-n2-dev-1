package day3homework2;



public class Main {

	public static void main(String[] args) 
	{
		Student adil = new Student(1, "Adil", "Usta", "Java kursu", "20", "05363944512",
			   "Düzce üniversitesi", 90);
	   StudentManager studentManager=new StudentManager();
	   studentManager.add(adil);
	   studentManager.showInformation(adil);
	   
	   Instructor engin = new Instructor(2, "Engin", "Demiroð","Java,C#", "35", "05364478541","ITIL,MCT,PMP");
	   InstructorManager instructorManager = new InstructorManager();
	   instructorManager.add(engin);
	   instructorManager.showInformation(engin);
	   
	   
	   UserManager userManager = new UserManager();
	 User users[]= new User[] {adil,engin};
	 for (User user : users) 
	 {
		userManager.add(user);
		userManager.showInformation(user);
	}
	 
	 
	 userManager.login("Adil", "123");
	 
	  
	   
			
	  
			  

	}

}
