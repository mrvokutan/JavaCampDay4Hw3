package Abstract;

import Entities.*;

public interface CampaingService {

	  void campaingAdd(Campaing campaing, Player player, Game game);
	
	 void campaingUpdate(Campaing campaing, Player player, Game game);

	 void campaingDelete(Campaing campaing, Player player, Game game);
}
