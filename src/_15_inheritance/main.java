package _15_inheritance;

import _17_Encapsulation.Patriots;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal george = new animal();
		george.name = "george the animal";
		george.numTeeth = 50;
		george.numLegs = 2;
		
		george.printLegs();
		george.getNumTeeth();
		george.printname();
		george.hunter();
		
		bear barney = new bear();
		barney.name = "barney";
		barney.isHibernating = true;
		barney.numTeeth = 80;
		barney.numLegs = 4;
		
		barney.speak();
		barney.printLegs();
		barney.getNumTeeth();
		barney.printname();
		barney.hunter();
		
		kangaroo hoppy = new kangaroo();
		hoppy.name = "jack";
		hoppy.bigFeet = true;
		hoppy.numTeeth = 120;
		hoppy.numLegs = 2;
		
		hoppy.speak();
		hoppy.printLegs();
		hoppy.getNumTeeth();
		hoppy.printname();
		hoppy.hunter();
		
		mouse jerry = new mouse();
		jerry.name= "jerry";
		
		
		jerry.speak();
		jerry.printname();
		jerry.hunter();
		
		Patriots brady = new Patriots();
		brady.name = "tom brady";
	}

}
