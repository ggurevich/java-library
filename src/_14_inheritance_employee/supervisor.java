package _14_inheritance_employee;

public class supervisor extends employee{
	
	
	public String office;
	
	
	supervisor(String name, double salary, int startyear, int birthyear){
		super(name, salary, startyear, birthyear);
		this.office = office;
	}
	
	@Override
	public void speak(){
		System.out.println("I make the schedule.");
	}

}
