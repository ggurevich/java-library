package _19_NewFriends;

public class Friends {
	private String name;
	private String job;
	private int birth;
	
	
	public Friends(String name, String job, int birth){
		this.name = name;
		this.job = job;
		this.birth = birth;
	}
	
	public String getName(){
		System.out.println(name);
		return name;
	}
	
	public String getJob(){
		System.out.println(job);
		return job;
	}
	
	public int getBirth(){
		System.out.println(birth);
		return birth;
	}
	
}




