package _06_inputoutput;

import java.util.Scanner;

public class _02_inputoutputchallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String hotdog;
		String taco ;
		String burger ;
		String name;
		String order;
		Scanner inputInfo = new Scanner(System.in);
		
		System.out.println("What is the name for this order?");
				name=inputInfo.nextLine();
		System.out.println(name);
		
		System.out.println("would you like a hotdog, taco, or burger?");
		order=inputInfo.nextLine();
		System.out.println(order);
		
		
		if (order.contains("hotdog")){
			System.out.println("enjoy your wiener");
		}  else if (order.contains("taco")) {
			System.out.println("enjoy your taco");
		}  else if (order.contains("burger")){
			System.out.println("enjoy your burger");
		} else {
				System.out.println("please select an item");
		}
		
		
	}

}
