package _09_loops;

public class _03_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] comedians = {"george carlin", "daniel tosh", "louis ck", "sarah silverman"};
		
		for(String comedian : comedians){
			System.out.println(comedian);
		}
	
		String[] bosses = {"jenn aikins", "bob alcorn", "robin holer"};
	
		for(String boss : bosses){
		System.out.println(boss);
		}
	
	
		String s = "hello";
		for(char ch : s.toCharArray()){
			System.out.println(ch);
		}
		
	
		
		
	}
	
	
	

}
