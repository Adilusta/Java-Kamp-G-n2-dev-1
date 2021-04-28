
public class CourseManager 

{
	public void kursEkle(Kurslar kurs) 
	{
		System.out.println(kurs.getKursAdi() +" eklendi,iyi çalýþmalar." + " \n");
	}
	
	
   public void kursGoruntule(Kurslar kurs) 
   {
	System.out.println("Kursun adý = " + kurs.getKursAdi());
	System.out.println("Kursun eðitmeni  = " + kurs.getEgitmenAdi());
	System.out.println("Kursun dili  = " + kurs.getKursDili());
	System.out.println("Kurs yüzdesi(ilerlemeniz)  = " + kurs.getKursYuzdesi() +"\n");
	
   }
   
   public void kursSil(Kurslar kurs) 
	{
		System.out.println(kurs.getKursAdi() + " silindi.");
	}
	
}
