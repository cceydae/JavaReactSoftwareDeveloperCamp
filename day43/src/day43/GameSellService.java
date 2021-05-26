package day43;

public interface GameSellService {

	void sell(Gamer gamer ,Game game,Campaign campaign );
	void cancelTheSale(Gamer gamer, Game game);
}
