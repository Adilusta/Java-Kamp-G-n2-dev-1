
public class CourseManager 

{
	public void kursEkle(Kurslar kurs) 
	{
		System.out.println(kurs.getKursAdi() +" eklendi,iyi �al��malar." + " \n");
	}
	
	
   public void kursGoruntule(Kurslar kurs) 
   {
	System.out.println("Kursun ad� = " + kurs.getKursAdi());
	System.out.println("Kursun e�itmeni  = " + kurs.getEgitmenAdi());
	System.out.println("Kursun dili  = " + kurs.getKursDili());
	System.out.println("Kurs y�zdesi(ilerlemeniz)  = " + kurs.getKursYuzdesi() +"\n");
	
   }
   
   public void kursSil(Kurslar kurs) 
	{
		System.out.println(kurs.getKursAdi() + " silindi.");
	}
	
}
