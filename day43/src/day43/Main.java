package day43;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1,"Ceyda","Eser",2000,"12345678910");
		Campaign campaign= new Campaign(1,"winter campaign",50);
		Game game =new Game(1,"The Witcher ",100);
		
		
		GamerManager gamerManager=new GamerManager(new ValidateUserManager());
		gamerManager.validate(gamer);
		
		System.out.println("-----------");
		
		GameSellManager gameSellManager=new GameSellManager(new CampaignManager());
		gameSellManager.sell(gamer,game,campaign);
		gameSellManager.cancelTheSale(gamer, game);
		
		System.out.println("----------------");
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.addNewCampaign(campaign);
		campaignManager.deleteCampaign(campaign);
		campaignManager.updateCampaign(campaign);
		
	}

}
