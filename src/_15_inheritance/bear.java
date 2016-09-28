package _15_inheritance;

public class bear extends animal{

	public boolean isHibernating;
	
	@Override
	public void speak(){
		System.out.println("roar");
	}
	
	public void hunter(){
		System.out.println( "I forage");
	}
	
	
}
