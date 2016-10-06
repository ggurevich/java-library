package _18_Encapsulation_Proper;

public class Main {

	public static void main(String[] args) {
		Player james = new Player("james", "buffed", 42, 50);
		
		
		Player paul = new Player("paul", "top gun", 56, 50);
		paul.getName();
		paul.getStatus();
		paul.getHealthPoints();
		
		
		
		Player gabe = new Player("gabriel", "gaining xp", 10, 50);
		

	}

}
