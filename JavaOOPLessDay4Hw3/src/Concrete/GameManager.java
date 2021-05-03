package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {

	@Override
	public void gameAdd(Game game, Player play) {
	System.out.println(play.getFirstName() + "Adlý oyuncu " + game.getId() + "numaralý oyunu ekledi.");
		
	}

	@Override
	public void gameUpdate(Game game, Player play) {
		System.out.println(play.getFirstName() + "Adlý oyuncu " + game.getId() + "numaralý oyunu güncelledi.");
		
	}

	@Override
	public void gameDelete(Game game, Player play) {
		System.out.println(play.getFirstName() + "Adlý oyuncu " + game.getId() + "numaralý oyunu sildi.");
	}

	@Override
	public void gameBuy(Game game, Player play) {
		System.out.println(play.getFirstName() + "Adlý oyuncu " + game.getId() + "numaralý oyunu satýn aldý.");
		
	}

	
}
