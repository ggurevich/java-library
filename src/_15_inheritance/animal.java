package _15_inheritance;

import java.util.Scanner;
public class animal {
	
	
	 Scanner scan = new Scanner(System.in);
			
			
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifespan;
	public boolean isWarmBlooded;
	public String name;
	public String habitat;
	
	public void hunter(){
		System.out.println( "I hunt");
	}
	
	
	public void printname(){
		System.out.println("My name is " + name);
	}
	
	public void printLegs(){
		System.out.println("I have " + numLegs + " legs.");
	}
	
	public void getNumTeeth(){
		System.out.println("How many teeth does " + name + " have?");
		int numTeeth = scan.nextInt();
		System.out.println(name + " has " + numTeeth + " teeth.");
	}
	
	public void speak() {
		System.out.println("I am an animal.");
	}
	//public void printTeeth(){
		//System.out.println("I have " + numTeeth + " teeth.");
	//}
}
	
	
	

