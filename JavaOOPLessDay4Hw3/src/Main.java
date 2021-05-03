import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaing;
import Entities.Game;
import Entities.Player;
import Entities.Sale;
                         
public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1, "Merve" , "Okutan" , "12345678910", 22 );
		
		Campaing campaing = new Campaing("Black Friday" , 123 , 100.5 ,12);
		
		Game game = new Game(456, "GTA 5") ;
		
		Sale sale = new Sale (789 , 10);
		
		
		PlayerManager playerManager = new PlayerManager();
		playerManager.add(player, game);
		
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.campaingUpdate(campaing, player, game);
		
		GameManager gameManager = new GameManager();
		gameManager.gameAdd(game, player);
		
		SaleManager saleManager = new SaleManager();	
		saleManager.campaingWithoutSale(game, sale, campaing);
		
		
		
		
		
	}

}
