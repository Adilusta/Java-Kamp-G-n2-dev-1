
public class Kurslar 
{

	private String kursAdi;
	private String egitmenAdi;
	private String kursDili;
	private double kursYuzdesi;
	
	
   public Kurslar(String kursAdi,String egitmenAdi,String kursDili,double kursYuzdesi)
   {
	
	   this.kursAdi=kursAdi;
	   this.egitmenAdi=egitmenAdi;
	   this.kursDili=kursDili;
	   this.kursYuzdesi=kursYuzdesi;
	   
   }


public String getKursAdi()
{
	return kursAdi;
}
   
public String getEgitmenAdi()
{
	return egitmenAdi;
}
public String getKursDili()
{
	return kursDili;
}

public double getKursYuzdesi()
{
	return kursYuzdesi;
}


	
	

	
	
	
}
