package day4Homework3;

public class Campaign implements Entities
{
    private String campaignCode;
	private double discountPercent;
	private Game game;
	public Campaign(String campaignCode, double discountPercent, Game game) 
	{
		super();
		this.campaignCode = campaignCode;
		this.discountPercent = discountPercent;
		this.game = game;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
	
}
