package Concrete;

import Abstract.VerificationService;
import Entities.Player;

public class VerificationManager implements VerificationService{

	@Override
	public boolean aut(Player player) {
		if(player.getBirthDay() > 18) {
			System.out.println("Do�rulama ba�ar�l�");
			return true;
		}else {
			System.out.println("ba�ar�s�z");
			return false;
	}
	
	}

}
