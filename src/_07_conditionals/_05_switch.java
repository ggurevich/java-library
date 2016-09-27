package _07_conditionals;

public class _05_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int whiteCastlesEaten = 20;
		String response;
		
		switch(whiteCastlesEaten){
			case 0:
				response = "thats probably smart";
				break;
			case 5:
				response = "are you ok?";
				break;
			case 10:
				response = "are you crazy?";
				break;
			case 20:
				response = "are you alive?";
				break;
			default:
				response = "are you hungry";
				break;
		}
		System.out.println(response);
		
		
	}

}
