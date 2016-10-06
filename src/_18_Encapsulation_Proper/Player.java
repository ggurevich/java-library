package _18_Encapsulation_Proper;

public class Player {
	private String name;
	private String status;
	private int highScore;
	private int healthPoints;
	
	//constructor
	public Player(String name, String status, int highScore, int healthPoints){
		this.name = name;
		this.status = status;
		this.highScore = highScore;
		this.healthPoints = healthPoints;
	}
		
		
		
		
		
		//getters
		public String getName(){
			System.out.println(name);
			return name;
		}
		
		public int highScore(){
			System.out.println(highScore);
			return highScore;
		}
		
		public int getHealthPoints(){
			System.out.println(healthPoints);
			return healthPoints;
		}
		
		public String getStatus(){
			System.out.println(status);
			return status;
		}
		
		//setters
		
		public void setNewPlayerName(String newName){
			name = newName;
		}
	}
