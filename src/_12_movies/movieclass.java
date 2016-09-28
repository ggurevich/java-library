package _12_movies;

public class movieclass {
	
	String movieName;
	String genre;
	String Actors;
	String Actress;
	int movieLength;
	int gross;
	boolean inRedBox;
	boolean onNetflix;
	
	//methods
	public void getMovieLength() {
		System.out.println(movieName + " is " + movieLength);
		
		
		//new method that prints box office gross
		
		
			
		}
	public void getGross() {
		System.out.println(movieName + " made " + gross);
	}
	
	movieclass(String genre, String Actors, int movieLength, int gross){
		this.genre=genre;
		this.Actors=Actors;
	}

}
