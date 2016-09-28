package _12_movies;

public class basicobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		movieclass theUsualSuspects = new movieclass("drama","kevin spacey", 125, 30000);
		System.out.println(theUsualSuspects.movieName + " is a " + theUsualSuspects.genre);
		//theUsualSuspects.Actors[0]="kevin spacey";
		//theUsualSuspects.Actors[1]="gabriel burn";
		//theUsualSuspects.Actress[0]="christine estabrook";
		//theUsualSuspects.Actress[1]= "suzy amis";
		//theUsualSuspects.genre = "Drama/thriller";
		theUsualSuspects.inRedBox = false;
		theUsualSuspects.genre = "Romance";
		theUsualSuspects.gross = 100000;
		theUsualSuspects.movieLength= 200;
		theUsualSuspects.movieName= "the usual suspects";
		System.out.println(theUsualSuspects.movieName + " is a " + theUsualSuspects.genre);
		
		theUsualSuspects.getMovieLength();
		theUsualSuspects.getGross();
		System.out.println(theUsualSuspects.Actors);
		System.out.println(theUsualSuspects.genre);
		
		
		
		
		movieclass tommyBoy = new movieclass("comedy","chris farley", 120, 20000);
		tommyBoy.gross = 35000;
		tommyBoy.movieLength = 420;
		tommyBoy.movieName = "tommy boy";
		
		tommyBoy.getGross();
		tommyBoy.getMovieLength();
		System.out.println(tommyBoy.genre);
		System.out.println(tommyBoy.Actors);
		
		
		
		//System.out.println(theUsualSuspects.genre);
		
		
	}

}
