package com.syntax.class09;

public class HWArray2 {

	public static void main(String[] args) {
		/*
		 * Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		
		
		String [] animals={"Dog", "Cat", "Cow ", "Deer", "Chicken"};
		
		for (String an:animals) {
			System.out.print(an + " ");
		}
		
		

			
		System.out.println(""); 		System.out.println("");
		
		
		for (int i=0; i < animals.length; i++) {
			
			System.out.print(animals[i]+" ");
		}

		
		
				
	}

}
