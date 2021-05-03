package Abstract;

import Entities.* ;

public interface SaleService {
	void saleAdd(Game game, Sale sale, Campaing campaing) ;
	
	void saleUpdate(Game game, Sale sale, Campaing campaing);
	
	void saleDelete(Game game, Sale sale, Campaing campaing , Player player);
	
	void campaingWithSale(Game game, Sale sale, Campaing campaing);
	
	void campaingWithoutSale(Game game, Sale sale, Campaing campaing);
}
