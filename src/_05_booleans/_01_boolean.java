package _05_booleans;

import org.omg.Messaging.SyncScopeHelper;

public class _01_boolean {
	public static void main(String[] args){
		
		boolean tired = true;
		boolean awake = true;
		System.out.println(tired);
		System.out.println(2>1);
		System.out.println(1>3);
		
		
		boolean taco = true;
		boolean hotdog = true;
		boolean lunch = taco;
		if (lunch = taco){
			System.out.println("Tacos!");
		} else if(lunch = hotdog) {
			System.out.println("hotdog!");
		} else {
			System.out.println("unavailable");		
		}		
		
	}
}
