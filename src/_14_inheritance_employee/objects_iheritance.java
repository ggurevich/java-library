package _14_inheritance_employee;

public class objects_iheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee paul = new employee("paul", 100000, 2015, 1980);
		manager e200 = new manager("sydney", 50000, 2016, 1985);
		supervisor upper = new supervisor("gabriel", 20000, 2016, 1987);
		
		e200.department="sales";
		upper.office = "corner";
		
		System.out.println(paul.salary);
		System.out.println(e200.name);
		System.out.println(e200.department);
		System.out.println(upper.office);
		
		
		paul.speak();
		e200.speak();
		upper.speak();
		
		
		
		
	}

}
