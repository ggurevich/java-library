package _08_Datacollection;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Gabriel");
		names.add("alan");
		names.addAll(Arrays.asList("esther", "divine"));
		System.out.println(names);
		
		ArrayList<Double> price = new ArrayList<Double>();
		
		price.add(2.99);
		price.add(12.35);
		price.addAll(Arrays.asList(11.50, 12.90));
		System.out.println(price);
		System.out.println(price.get(0));
		System.out.println(price.get(1));
		System.out.println(price.get(2));
		
		
		
		
		
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		ages.add(28);
		ages.add(26);
		ages.addAll(Arrays.asList(22,25));
		System.out.println(ages);
		
		
		
	}

}
