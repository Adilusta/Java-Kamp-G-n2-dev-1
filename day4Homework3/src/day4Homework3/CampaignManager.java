package day4Homework3;

public class CampaignManager implements CampaignService
{

	@Override
	public void add(Campaign campaign) 
	{
	System.out.println("Kampanya eklendi : "+ campaign.getCampaignCode());
		
	}

	@Override
	public void update(Campaign campaign)
	{
		System.out.println("Kampanya güncellendi : "+ campaign.getCampaignCode());
		
	}

	@Override
	public void delete(Campaign campaign) 
	{
		System.out.println("Kampanya silindi : "+ campaign.getCampaignCode());
		
	}

}
