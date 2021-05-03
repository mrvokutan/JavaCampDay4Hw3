package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {

	@Override
	public void gameAdd(Game game, Player play) {
	System.out.println(play.getFirstName() + "Adl� oyuncu " + game.getId() + "numaral� oyunu ekledi.");
		
	}

	@Override
	public void gameUpdate(Game game, Player play) {
		System.out.println(play.getFirstName() + "Adl� oyuncu " + game.getId() + "numaral� oyunu g�ncelledi.");
		
	}

	@Override
	public void gameDelete(Game game, Player play) {
		System.out.println(play.getFirstName() + "Adl� oyuncu " + game.getId() + "numaral� oyunu sildi.");
	}

	@Override
	public void gameBuy(Game game, Player play) {
		System.out.println(play.getFirstName() + "Adl� oyuncu " + game.getId() + "numaral� oyunu sat�n ald�.");
		
	}

	
}
