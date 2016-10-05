package _16_interfaces;

public class cd implements Ifunctions{
	
	

	
	@Override
	public void play() {
		System.out.println("cd is now playing");
		
	}

	@Override
	public void stop() {
		System.out.println("cd is stopped");
		
	}

	@Override
	public void skip() {
		System.out.println("skip to next song");
		
	}

	@Override
	public void menu() {
		System.out.println("show cd menu");
		
	}

	@Override
	public void pause() {
		System.out.println("cd on pause");
		
	}
	
	public void turnUpToEleven(){
		System.out.println("turn it up");
	}

	@Override
	public void getTitle(String title) {
		System.out.println(title);
		
	}

	 

}
