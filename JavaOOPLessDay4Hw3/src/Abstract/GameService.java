package Abstract;

import Entities.* ;

public interface GameService {
	
	void gameAdd(Game game, Player play);
	
	void gameUpdate(Game game, Player play);
	
	void gameDelete(Game game, Player play);
	
	void gameBuy(Game game, Player play);

}
