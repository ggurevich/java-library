package _17_Encapsulation;

import _18_Encapsulation_Proper.Player;

public class main {

	public static void main(String[] args) {
		
		ColtsPlayers aLuck = new ColtsPlayers();
		aLuck.name = "andrew luck";
		aLuck.age = 27;
		
		Player james = new Player("james", "buffed", 42, 50);
		
		
		Player paul = new Player("paul", "top gun", 56, 50);
		paul.getName();
		paul.getStatus();
		paul.getHealthPoints();
		
		
		
		Player gabe = new Player("gabriel", "gaining xp", 10, 50);
			}

}
