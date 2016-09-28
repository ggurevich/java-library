package _14_inheritance_employee;

public class employee {

	public String name;
	double salary;
	int startyear;
	int birthyear;
	
	//constructor
	//a consturctor is a method that has the same name as the class itself
	//it builds our instances or object of that class type
	
	employee(String name, double salary, int startyear, int birthyear){
		this.name = name;
		this.salary = salary;
	}
	
	public void speak(){
		System.out.println("I work the floor.");
	}
	
}
