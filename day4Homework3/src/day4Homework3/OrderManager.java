package day4Homework3;

public class OrderManager implements OrderService
{
	Campaign campaign;
public OrderManager(Campaign campaign)
{
	this.campaign = campaign;
}
	@Override
	public void add(Order order,Campaign campaign) 
	{
		System.out.println("Sipari� eklendi " + order.getOrderId());
		
	}

	@Override
	public void update(Order order) 
	{
	
		System.out.println("Sipari� g�ncellendi " + order.getOrderId());
	}

	@Override
	public void delete(Order order)
	{
		System.out.println("Sipari� silindi " + order.getOrderId());
		
	}

	@Override
	public void showOrderInformation(Order order) 
	{
		System.out.println("Sipari� bilgileri : \n"+" Sipari� ID : " + order.getOrderId()+"\n"+"Sipari� tarihi :" + order.getOrderDate()+"\n"+" "+"M��teri isim soyisim : " +order.getUser().getFirstName()+ " "+order.getUser().getLastName()+ "\n"
	+"Oyun ID:" +order.getGame().getGameId()+ "\n"+
				"Oyunun ismi : " + order.getGame().getName()+ "\n"+"Oyunun fiyat� : " + order.getGame().getPrice()+" TL" + "\n"+ "Oyunun kategorisi :" +order.getGame().getCategory()+"\n"
				+"Oyunun yap�mc�s� : "+  order.getGame().getProducer().getFirstName() +" " + order.getGame().getProducer().getLastName()
				+ "\n"+ "Kampanya : "+ campaign.getCampaignCode()+"\n"+ "�ndirim oran� : %"+
				campaign.getDiscountPercent()+"\n" + "�ndirimden sonraki fiyat (son fiyat) : "+
 ( order.getGame().getPrice() -  (order.getGame().getPrice()* campaign.getDiscountPercent() / 100) ) + " TL" );
		
		
	}
	
	


}