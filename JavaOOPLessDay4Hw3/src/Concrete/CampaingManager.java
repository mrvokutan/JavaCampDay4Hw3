package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;
import Entities.Game;
import Entities.Player;

public class CampaingManager implements CampaingService{

	@Override
	public void campaingAdd(Campaing campaing, Player player, Game game) {
		System.out.println(game.getId() + "Numaralý oyunda " + campaing.getCampaingName() + "kampanyasý eklendi.");
		
	}

	@Override
	public void campaingUpdate(Campaing campaing, Player player, Game game) {
		System.out.println(game.getId() + "Numaralý oyunda" + campaing.getCampaingName() + "güncellendi.");
		
	}

	@Override
	public void campaingDelete(Campaing campaing, Player player, Game game) {
		System.out.println( "Sayýn " + player.getFirstName() + game.getGameName()+ "adlý oyununuzun" + campaing.getCampaingName() + "kampanyasý silindi. " );
		
	}

}
