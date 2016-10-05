package _03_numbers;

public class _02_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 5+2;
		int second = 7-2;
		int third = 5*5;
		int fourth = 30/5;
		
		System.out.println(13 % 4);
		
		
		int ten = 5 + 5;
		
		ten = ten + 1;
		
		System.out.println(ten);
		
		//1
		ten=ten + 1;
		
		System.out.println(ten);
		
		//2
		ten += 1;
		
		System.out.println(ten);
		
		
		double stockPrice;
		 stockPrice = 3.75;
		stockPrice *= 1.3;
		
		System.out.println(stockPrice);
		
		int incNumber = ten++;
		System.out.println(ten);
		
		
		//practice
		int one = 5 + 3;
		int two = 5 - 3;
		int three = 5 * 3;
		int four = 15 / 3;
		
		System.out.println(one + " " + two + " " + three + " " + four);
		
		one = one + 1;
		
		System.out.println(one);
		
		one += 1;
		System.out.println(one);
		//should be 11. still says 10
		int hello = one++;
		System.out.println(hello);
		
		
	}
	
	
	
	

}

