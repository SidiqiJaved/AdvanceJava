package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
	
	// print name of cities

		
		
		String []cities = {"DC", "Baltimore", "LA", "NYC"};
		
		for (String city:cities) {
			
			System.out.print(city + " " );
		}
		
		
		System.out.println("");		System.out.println("");

		
		
		
		int [] numbers={10, 20, 30, 40, 50 };
		
		for (int num:numbers)
		{
			System.out.print(num + " ");
		}
		
		System.out.println("");		System.out.println("");
		
		
		
		char [] grades= {'A', 'B' , 'C', 'D'};
		
		for( char grade:grades) {
			
			System.out.print(grade + " ");
		}
		
		System.out.println("");		System.out.println("");

		
		
		String [] countries= {"UAS", "AFG", "JAPAN", "UK"};
		
		for (String country:countries) {
			System.out.print (country + " ");
		}
		
	}

}
