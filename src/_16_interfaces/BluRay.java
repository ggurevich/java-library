package _16_interfaces;

public class BluRay implements Ifunctions{
	
	

	@Override
	public void play() {
		System.out.println("bluray is playing");
		
	}

	@Override
	public void stop() {
		System.out.println("bluray is stopped");
		
	}

	@Override
	public void skip() {
		System.out.println("bluray skip to next chapter");
		
	}

	@Override
	public void menu() {
		System.out.println("bluray main menu");
		
	}

	@Override
	public void pause() {
		System.out.println("bluray is paused");
		
	}
	
	public void live() {
		System.out.println("live commentary broadcast");
	}

	@Override
	public void getTitle(String title) {
		System.out.println(title);
		
	}
	
	

}
