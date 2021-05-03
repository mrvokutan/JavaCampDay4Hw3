package Concrete;

import Abstract.VerificationService;
import Entities.Player;

public class VerificationManager implements VerificationService{

	@Override
	public boolean aut(Player player) {
		if(player.getBirthDay() > 18) {
			System.out.println("Doðrulama baþarýlý");
			return true;
		}else {
			System.out.println("baþarýsýz");
			return false;
	}
	
	}

}
