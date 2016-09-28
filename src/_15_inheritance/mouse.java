package _15_inheritance;

public class mouse extends animal{
	
	@Override
	public void speak(){
		System.out.println("squek");
	}
	
	public void hunter(){
		System.out.println( "I scavenge");
	}

}
