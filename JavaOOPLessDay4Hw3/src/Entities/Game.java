package Entities;

public class Game {
	private int id ;
	private String gameName ;
	
	public Game () {
		
	}
	
	public Game(int id, String gameName) {
		super();
		this.id = id;
		this.gameName = gameName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
}
