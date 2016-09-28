package _14_inheritance_employee;

public class manager extends employee{

	
	public String department;
	
	manager(String name, double salary, int startyear, int birthyear){
		super(name, salary, startyear, birthyear);
		this.department = department;
	}
	
	@Override
	public void speak(){
		System.out.println("I check paperwork.");
	}
	//super with properties and overides with methods
	
}
