package day4Homework3;

public class Game implements Entities
{
private	int gameId;
private String name;
private int price;
private String category;
private Producer producer;

public Game(int gameId,String name, int price, String category, Producer producer) 
{
	super();
	this.setGameId(gameId);
	this.name = name;
	this.price = price;
	this.category = category;
	this.producer = producer;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public Producer getProducer() {
	return producer;
}

public void setProducer(Producer producer) {
	this.producer = producer;
}

public int getGameId() {
	return gameId;
}

public void setGameId(int gameId) {
	this.gameId = gameId;
}


}
