package _15_inheritance;

public class kangaroo extends animal{
	
	boolean bigFeet;
	
	@Override
	public void speak(){
		System.out.println("yip yip");
	}
	
	public void hunter(){
		System.out.println( "I graze");
	}

}
