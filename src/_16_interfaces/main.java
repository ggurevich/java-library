package _16_interfaces;

public class main {

	public static void main(String[] args) {
		// create a cd and dvd opject and call methods on those objects
		
		
		cd music = new cd();
		music.play();
		music.stop();
		music.pause();
		music.skip();
		music.menu();
		music.turnUpToEleven();
		music.getTitle("custom mix");
		
		dvd movie = new dvd();
		movie.play();
		movie.stop();
		movie.pause();
		movie.skip();
		movie.menu();
		movie.soundSetting();
		movie.getTitle("home movie");
		
		BluRay film = new BluRay();
		film.pause();
		film.play();
		film.stop();
		film.skip();
		film.menu();
		film.live();
		film.getTitle("pirated move");
		

	}

}
