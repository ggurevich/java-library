package _03_numbers;

public class _03_demochallenge {
	public static void main(String[] args){
		
		
		// man goes to eat with the following balance
		double bankBal = 200.00;
		
		//purchased items
		
		double bloomOnion = 14.99;
		double chiSan = 10.99;
		double choCake = 7.99;
		
		// total bill
		
		double totalBill = (bloomOnion + chiSan + choCake);
		System.out.println(totalBill);
		
		// new bank balance
		double newBankBal = (bankBal - totalBill);
		System.out.println(newBankBal);
	}
}
