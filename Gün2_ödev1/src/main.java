import java.util.Iterator;

public class main {

	public static void main(String[] args) 
	{
		
      Kurslar kurs1 = new Kurslar("Java kursu","Engin Demiroð","Java", 36.3);
      Kurslar kurs2 = new Kurslar("C# kursu ", "Engin Demiroð", " C# ", 27.5);
      Kurslar kurs3 = new Kurslar("C++ kursu ","Engin Demiroð", "C++", 50.5);
      Kurslar kursDizisi [] = {kurs1,kurs2,kurs3};
      
      System.out.println("Kurslarýmýz :  " );
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
     
      
      System.out.println("Sýk sorulan sorular : ");
      
      
      Sorular soru_1 = new Sorular(1,"Kurslar ücretli mi ? ");
      Sorular soru_2 = new Sorular(2,"Hiç programlama bilgim yok,yine de bu kursa katýlabilir miyim?");
      Sorular soru_3 = new Sorular(3,"Derse katýlamadým,sonradan videolarý izleyebilir miyim? ");
      
      
      
      Sorular siksorulanSorular [] = {soru_1,soru_2,soru_3};
      
      for (Sorular sorular : siksorulanSorular) 
      {
		System.out.println(sorular.getSoruNumarasi()+" " + sorular.getSoru());
	  }
      
      
	}

}
