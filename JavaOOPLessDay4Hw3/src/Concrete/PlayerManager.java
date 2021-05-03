package Concrete;

import Abstract.PlayerService;
import Entities.Game;
import Entities.Player;

public class PlayerManager implements PlayerService{

	@Override
	public void add(Player player, Game game) {
		System.out.println("Oyuncu eklendi" + player.getFirstName());
		
	}

	@Override
	public void update(Player player, Game game) {
		System.out.println("Oyuncu güncellendi." + player.getFirstName()) ;
		
	}

	@Override
	public void delete(Player player, Game game) {
	System.out.println(game.getGameName() + "Adlý oyununun"  + player.getFirstName()  + "oyuncusu silindi.");
		
	}
	
    
}
