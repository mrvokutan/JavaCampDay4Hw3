package Concrete;

import Abstract.* ;
import Entities.Campaing;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class SaleManager implements SaleService {

	@Override
	public void saleAdd(Game game, Sale sale, Campaing campaing) {
		System.out.println(sale.getSaleId() +  "Numaralý stoða" + game.getId() + "numaralý ürünün satýþý eklendi" );
		
	}

	@Override
	public void saleUpdate(Game game, Sale sale, Campaing campaing) {
		System.out.println(sale.getSaleId() +  "Numaralý stokta" + campaing.getCampaingName()+ "indirimi baþladý" );
		
	}

	@Override
	public void saleDelete(Game game, Sale sale, Campaing campaing , Player player) {
        System.out.println(player.getFirstName() + "adlý oyuncunun " + sale.getSaleId() + " numaralý satýþ durduruldu. ");

		
	}

	@Override
	public void campaingWithSale(Game game, Sale sale, Campaing campaing) {
		System.out.println(sale.getSaleId()+ "Numaralý satýþa " + campaing.getCampaingId() + "numaralý ürünün kampanyasý baþlatýldý." );
		
	}

	@Override
	public void campaingWithoutSale(Game game, Sale sale, Campaing campaing) {
		System.out.println(game.getId()+ "Numaralý ürünün kampanyasýz satýþ fiyatý : " + sale.getPrice());
		
	}

}
