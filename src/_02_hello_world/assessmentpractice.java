package _02_hello_world;

public class assessmentpractice {

	public static void main(String[] args) {
		 int speed = 5;
		  	       
		  	       if(speed == 5){
		  	       	System.out.println("parking lot");
		  	       }else if(speed == 15){
		  	       	System.out.println("school zone");
		  	       }else if(speed == 30){
		  	       	System.out.println("streets");
		  	       }
		  	       
		 String[] movies = {"star wars", "john carter", "matrix", "wolfman"};
		 System.out.println(movies[2]);
		 
		 for(String film : movies){
			 System.out.println(film);
		 }
		 
		 for( int i= 10; i >= 1; i--){
			 System.out.println(i);
		 }

	}

}
