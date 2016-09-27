package _09_loops;

public class _02_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//forinitialize lcv(loop control variable); relational test lcv; midfy lcv
		for(int i=0; i<= 10; i++) {
			System.out.println(i);
		}
		
		for(int i=0; i<=100; i+=5){
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		
		
		//TODO simple interest over time
		
		double balance = 5000;
		double rate = 1.02;
		int years = 10;
		
		for(int i = 0; i <= 10; i++){
			balance *= rate;
		}
		System.out.println(balance);
		
		String spaces = "there are spaces in this string and i had a chicken sandwich for lunch";
		int numSpaces = 0;
		//System.out.println(spaces.length());
				//System.out.println(spaces.charAt(30));
		for(int i=0; i<spaces.length(); i++){
			System.out.println(spaces.charAt(i));
		}
		
		for(int i=0; i<spaces.length(); i++){
			if(spaces.charAt(i) != ' '){
				continue;
			} else {
				numSpaces++;
			}
		}System.out.println( "there are " + numSpaces + " spaces in your string");
	}
	
}
