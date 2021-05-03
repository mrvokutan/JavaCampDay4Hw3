package Concrete;

import Abstract.* ;
import Entities.Campaing;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class SaleManager implements SaleService {

	@Override
	public void saleAdd(Game game, Sale sale, Campaing campaing) {
		System.out.println(sale.getSaleId() +  "Numaral� sto�a" + game.getId() + "numaral� �r�n�n sat��� eklendi" );
		
	}

	@Override
	public void saleUpdate(Game game, Sale sale, Campaing campaing) {
		System.out.println(sale.getSaleId() +  "Numaral� stokta" + campaing.getCampaingName()+ "indirimi ba�lad�" );
		
	}

	@Override
	public void saleDelete(Game game, Sale sale, Campaing campaing , Player player) {
        System.out.println(player.getFirstName() + "adl� oyuncunun " + sale.getSaleId() + " numaral� sat�� durduruldu. ");

		
	}

	@Override
	public void campaingWithSale(Game game, Sale sale, Campaing campaing) {
		System.out.println(sale.getSaleId()+ "Numaral� sat��a " + campaing.getCampaingId() + "numaral� �r�n�n kampanyas� ba�lat�ld�." );
		
	}

	@Override
	public void campaingWithoutSale(Game game, Sale sale, Campaing campaing) {
		System.out.println(game.getId()+ "Numaral� �r�n�n kampanyas�z sat�� fiyat� : " + sale.getPrice());
		
	}

}
