package day43;

public class GameSellManager implements GameSellService{

	CampaignManager campaignManager;
	
	public GameSellManager(CampaignManager campaignManager) {
		super();
		this.campaignManager = campaignManager;
	}

	@Override
	public void sell(Gamer gamer, Game game,Campaign campaign) {
		System.out.println(gamer.getFirstName()+
				" bought "+ game.getName()+"with the " +
				campaign.getCampaignName()+ " campaign. ");
	}

	@Override
	public void cancelTheSale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+","+ game.getName()+ "sale failed");
		
	}

	
}
