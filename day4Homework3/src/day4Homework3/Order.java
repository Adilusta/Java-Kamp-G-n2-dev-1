package day4Homework3;

public class Order
{
	private int orderId;
    private String orderDate;
    private User user;
    private Game game;
    private Campaign campaign;

public Order(int orderId,String orderDate,User user,Game game,Campaign campaign) {
	super();
	
	this.orderId=orderId;
	this.orderDate = orderDate;
	this.user = user;
	this.game= game;
	this.campaign = campaign;
}

public String getOrderDate() {
	return orderDate;
}

public int getOrderId() {
	return orderId;
}

public Game  getGame() 
{
return game;
}

public Campaign getCampaign() {
	return campaign;
}

public User getUser() {
	return user;
}



}
