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
		System.out.println("Sipariþ eklendi " + order.getOrderId());
		
	}

	@Override
	public void update(Order order) 
	{
	
		System.out.println("Sipariþ güncellendi " + order.getOrderId());
	}

	@Override
	public void delete(Order order)
	{
		System.out.println("Sipariþ silindi " + order.getOrderId());
		
	}

	@Override
	public void showOrderInformation(Order order) 
	{
		System.out.println("Sipariþ bilgileri : \n"+" Sipariþ ID : " + order.getOrderId()+"\n"+"Sipariþ tarihi :" + order.getOrderDate()+"\n"+" "+"Müþteri isim soyisim : " +order.getUser().getFirstName()+ " "+order.getUser().getLastName()+ "\n"
	+"Oyun ID:" +order.getGame().getGameId()+ "\n"+
				"Oyunun ismi : " + order.getGame().getName()+ "\n"+"Oyunun fiyatý : " + order.getGame().getPrice()+" TL" + "\n"+ "Oyunun kategorisi :" +order.getGame().getCategory()+"\n"
				+"Oyunun yapýmcýsý : "+  order.getGame().getProducer().getFirstName() +" " + order.getGame().getProducer().getLastName()
				+ "\n"+ "Kampanya : "+ campaign.getCampaignCode()+"\n"+ "Ýndirim oraný : %"+
				campaign.getDiscountPercent()+"\n" + "Ýndirimden sonraki fiyat (son fiyat) : "+
 ( order.getGame().getPrice() -  (order.getGame().getPrice()* campaign.getDiscountPercent() / 100) ) + " TL" );
		
		
	}
	
	


}