package com.syntax.class09;

public class HWARrays {

	
	
	public static void main(String[]args) {
		
		
		
		/*
		 * Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.
		 */
		
		
		
		String [] cars=new String[6];
		
		cars[0]="Mustang";
		cars[1]="Lexus";
		cars[2]="Tesla";
		cars[3]="Camery";
		cars[4]="Nio";
		cars[5]="BM";
		
for (int i=0; i < cars.length; i++) {
	System.out.print(cars[i]+ " ");
}
				
		System.out.println(" "); System.out.println(" ");
		
		
		
		for (String car:cars) {
			System.out.print(car+ " ");
		}
		
		
		
		
		
	}
}
