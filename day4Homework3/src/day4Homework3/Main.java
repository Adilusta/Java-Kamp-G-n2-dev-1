package day4Homework3;


public class Main {

	public static void main(String[] args) 
	{
		
	Producer producer = new Producer("Adil", "Usta", "20");
	ProducerService producerManager = new ProducerManager();
	producerManager.addProducer(producer);
	producerManager.showInformation(producer);
	System.out.println("\n");
	
	
	Game game = new Game(1,"Mount and Blade", 150, "RPG", producer);
	GameService gameManager= new GameManager();
	gameManager.add(game);
	System.out.println("\n");
	
	User user = new User(new UserCheckManager(),785, "4855741323", "Mehmet", "Kabak", 1984);
	UserService userManager = new UserManager(new UserCheckManager());
	userManager.add(user);
	System.out.println("\n");
	
	Order order= new Order(47856, "11/05/2021",user, game, new Campaign("MBB%20", 20, game));
	
	

	OrderService orderManager = new OrderManager(order.getCampaign());
	orderManager.add(order, order.getCampaign());
	System.out.println("\n");
	orderManager.showOrderInformation(order);
	
	
	}

}
