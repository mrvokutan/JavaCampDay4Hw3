package Entities;

public class Player {
	int id ;
    private String firstName;
	private String lastName ;
	private String nationalId ;
	private int birthDay ;
	
	public Player() {
		
	}
	
	public Player(int id, String firstName, String lastName, String nationalId, int birthDay) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.birthDay = birthDay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	

}
