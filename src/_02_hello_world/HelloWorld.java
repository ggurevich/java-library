package _02_hello_world;

import _17_Encapsulation.ColtsPlayers;

public class HelloWorld
{
	public static void main(String[] args)
	{ // TODO change font
		System.out.println("Hello World");
		ColtsPlayers aCastonzo = new ColtsPlayers();
		aCastonzo.name = "Anthony";
		aCastonzo.setNumber(74);
		System.out.println(aCastonzo.getNumber());
	
	}
	
	

}
