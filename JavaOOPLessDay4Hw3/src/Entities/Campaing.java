package Entities;

public class Campaing {
	private String campaingName ;
	private int campaingId ;
	private double discount ;
	private int gameId ;
	
	
	public Campaing() {
		
	}
	
	
	public Campaing(String campaingName, int campaingId, double discount, int gameId) {
		super();
		this.campaingName = campaingName;
		this.campaingId = campaingId;
		this.discount = discount;
		this.gameId = gameId;
	}
	public String getCampaingName() {
		return campaingName;
	}


	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}


	public int getCampaingId() {
		return campaingId;
	}


	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public int getGameId() {
		return gameId;
	}


	public void setGameId(int gameId) {
		this.gameId = gameId;
	}


	
}
