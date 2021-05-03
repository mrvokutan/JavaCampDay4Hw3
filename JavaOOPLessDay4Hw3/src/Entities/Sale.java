package Entities;

public class Sale {
	private int saleId ;
	private int price ;
	
	public Sale() {
		
	}
	
	
	public Sale(int saleId, int price) {
		super();
		this.saleId = saleId;
		this.price = price;
	}
	
	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
		
}
