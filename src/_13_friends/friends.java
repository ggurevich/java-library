package _13_friends;

public class friends {
	
	String name;
	String school;
	String work;
	String family;
	boolean isFam;
	boolean isAcquaintance;
	int birth;
	String state;
	int years;
	boolean female;
	boolean curCity;
	String hometown;
	
//	if(female=true){
	//	System.out.println("her ");
		//} else {
			//System.out.println("his");
	//	}
	
	public void cityCheck(){
		if(curCity != hometown){
			System.out.println(name + " has moved away from home.");
		} else {
			System.out.println();
		}
	}
	
	public void getYears(){
		System.out.println("you have been friends with " + name + " for " + years + " years.");
	}
	public void getIsFam(){
		if(isFam){
			System.out.println(name + " is family");
		} else {
			System.out.println(name + " is not family");
		}
	}
}
