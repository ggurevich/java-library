package _16_interfaces;

public class dvd implements Ifunctions {
	
	

	@Override
	public void play() {
		System.out.println("dvd is playing");
		
	}

	@Override
	public void stop() {
		System.out.println("dvd is stopped");
		
	}

	@Override
	public void skip() {
		System.out.println("skip to next chapter");
		
	}

	@Override
	public void menu() {
		System.out.println("dvd menu");
		
	}

	@Override
	public void pause() {
		System.out.println("film is on pause");
		
	}
	
	public void soundSetting() {
		System.out.println("stereo, mono, or surround?");
	}

	@Override
	public void getTitle(String title) {
		System.out.println(title);
		
	}

}
