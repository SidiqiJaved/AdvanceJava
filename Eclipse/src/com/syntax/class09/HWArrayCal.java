package com.syntax.class09;

public class HWArrayCal {

	public static void main(String[] args) {
		/*
		 * Create an array on integers and calculate the sum of all elements in an array
		 */
		
		int[] cal= {1+2+3+4+ 12+12+14+97};
		
		for(int num:cal) {
			System.out.println("The sum of all numbers is "+num);
		}
		
		
		System.out.println(""); 		System.out.println("");

		
		int []cal1= {1, 2, 3, 4, 12, 12, 14 ,97};
		
		int sum=0;
		
		for (int i=0; i<cal1.length; i++) {
			 sum+=cal1[i];
			 
		}
		
		System.out.println(" The sum of all numbers is " +sum);
		
	}

}
