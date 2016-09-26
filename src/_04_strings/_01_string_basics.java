package _04_strings;

public class _01_string_basics {
	public static void main(String[] args){
		
		String name = "Gabe";
		String address = "123 drive";
		
		String toLowerCase = name.toLowerCase();
		
		System.out.println(toLowerCase);
		
		String allCaps = address.toUpperCase();
		
		System.out.println(allCaps);
		
		
		String firstName = "Gabriel";
		String middleIni = "S";
		String lastName = "Gurevich";
		String fullName = firstName + " " + middleIni + " " + lastName;
		//1 method
		System.out.println(fullName);
		//2 method
		System.out.println(firstName + " " + middleIni + " " + lastName);
		
		String sentence = "soda can";
		
		String soda = sentence.substring(0, 4);
		String can = sentence.substring(5);
		
		
		
		System.out.println(soda);
		System.out.println(can);
		
		
	}

}
