import java.util.Iterator;

public class main {

	public static void main(String[] args) 
	{
		
      Kurslar kurs1 = new Kurslar("Java kursu","Engin Demiro�","Java", 36.3);
      Kurslar kurs2 = new Kurslar("C# kursu ", "Engin Demiro�", " C# ", 27.5);
      Kurslar kurs3 = new Kurslar("C++ kursu ","Engin Demiro�", "C++", 50.5);
      Kurslar kursDizisi [] = {kurs1,kurs2,kurs3};
      
      System.out.println("Kurslar�m�z :  " );
     for (Kurslar kurslar : kursDizisi)
     {
		System.out.println(kurslar.getKursAdi());
		
	 }
      
      
      CourseManager courseManager = new CourseManager();
      courseManager.kursEkle(kurs1);
      courseManager.kursEkle(kurs2);
      courseManager.kursEkle(kurs3);
      courseManager.kursGoruntule(kurs1);
      courseManager.kursGoruntule(kurs2);
      courseManager.kursGoruntule(kurs3);
      courseManager.kursSil(kurs1);
      courseManager.kursSil(kurs2);
      courseManager.kursSil(kurs3);
     
      
      System.out.println("S�k sorulan sorular : ");
      
      
      Sorular soru_1 = new Sorular(1,"Kurslar �cretli mi ? ");
      Sorular soru_2 = new Sorular(2,"Hi� programlama bilgim yok,yine de bu kursa kat�labilir miyim?");
      Sorular soru_3 = new Sorular(3,"Derse kat�lamad�m,sonradan videolar� izleyebilir miyim? ");
      
      
      
      Sorular siksorulanSorular [] = {soru_1,soru_2,soru_3};
      
      for (Sorular sorular : siksorulanSorular) 
      {
		System.out.println(sorular.getSoruNumarasi()+" " + sorular.getSoru());
	  }
      
      
	}

}
