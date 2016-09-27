package _06_inputoutput;

import java.util.Scanner;

public class _01_getting_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String birthCity;
		String name;
		String age;
		
		//Scaner is a java class- used for user input
		
		Scanner inputInfo = new Scanner(System.in);
				
		//setup simple user input
				
		System.out.println("enter your name below:");
		 name=inputInfo.nextLine();
		System.out.println(name);
		
		System.out.println("enter your city of birth below:");
		 birthCity=inputInfo.nextLine();
		System.out.println(birthCity);
		
		System.out.println("enter your age below:");
		 age=inputInfo.nextLine();
		System.out.println(age);
		
		// use concatenation to make a sentence using these inputs
		
		System.out.println("hello " + name + " you were born in " + birthCity + " and you are " + age + " years old");
		
	}

}
