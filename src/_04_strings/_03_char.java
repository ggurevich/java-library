package _04_strings;

public class _03_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char uniChar = '\u00A5'; // TODO look up a unicode number that works
		System.out.println(uniChar);
		
		char[] charArray = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(charArray);
		
		String charArry = "abcde";
		System.out.println(charArry);
		
		
		// find a diff unicode and assign to a new var
		// print out
		// create new char array and print it out
		
		char dollar = '\u0024';
		System.out.println(dollar);
		
		String newCharArray = "hello";
		System.out.println(newCharArray);
		
		
		System.out.println("hello \"tough guy\", How are you?");
		System.out.println("james \npaul");
		System.out.println("hello good sir \fwould you like some tea?");
		
	}

}



// \t	Inserts a tab in the text at this point.
// \b	Inserts a backspace in the text at this point.
// \n	Inserts a newline in the text at this point.
// \r	Inserts a carriage return in the text at this point.
// \f	Inserts a form feed in the text at this point.
// \'	Inserts a single quote character in the text at this point.
// \"	Inserts a double quote character in the text at this point.
// \\	Inserts a backslash character in the text at this point.