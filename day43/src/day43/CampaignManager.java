package day43;

public class CampaignManager implements CampaignService{

	@Override
	public void addNewCampaign(Campaign campaign) {
		System.out.println("New campaign added : " + campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("campaign is over: "+ campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Campaign has been updated : "+ campaign.getCampaignName());
		
	}

}
