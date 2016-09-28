package _11_classproperties;

public class basicobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car paulsCar = new Car();
		
		//paulsCar is object or instance of the Car class.
		
		paulsCar.make = "tesla";
		paulsCar.model = "model 3";
		paulsCar.color = "black";
		paulsCar.isfast = true;
		paulsCar.isElectric = true;
		paulsCar.mpc = 300;
		
		
		// make car with 8 properies
		
		car mycar = new Car();
		
		mycar.make = "toyota";
		mycar.model = "prius";
		mycar.color = "orange";
		mycar.mpgcity= 50;
		mycar.mpghighway = 60;
		mycar.isElectric= false;
		mycar.isfast = false;
		mycar.ispopwithmill = false;
		
		
		
		
		
		
		
		
		
		
	}

}
