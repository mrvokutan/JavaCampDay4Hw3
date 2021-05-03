package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;
import Entities.Game;
import Entities.Player;

public class CampaingManager implements CampaingService{

	@Override
	public void campaingAdd(Campaing campaing, Player player, Game game) {
		System.out.println(game.getId() + "Numaral� oyunda " + campaing.getCampaingName() + "kampanyas� eklendi.");
		
	}

	@Override
	public void campaingUpdate(Campaing campaing, Player player, Game game) {
		System.out.println(game.getId() + "Numaral� oyunda" + campaing.getCampaingName() + "g�ncellendi.");
		
	}

	@Override
	public void campaingDelete(Campaing campaing, Player player, Game game) {
		System.out.println( "Say�n " + player.getFirstName() + game.getGameName()+ "adl� oyununuzun" + campaing.getCampaingName() + "kampanyas� silindi. " );
		
	}

}
