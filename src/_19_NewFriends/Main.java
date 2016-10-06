package _19_NewFriends;

public class Main {

	public static void main(String[] args) {


		Friends josh = new Friends("josh", "lawyer", 1980);
		josh.getName();
		josh.getBirth();
		josh.getJob();
		
		
		Friends mike = new Friends("mike", "doctor", 1998);
		mike.getName();
		mike.getJob();
		mike.getBirth();
		
		
		if(josh.equals(mike)){
			System.out.println("same name");
		}else{
			System.out.println("different");
		}

	}

}
