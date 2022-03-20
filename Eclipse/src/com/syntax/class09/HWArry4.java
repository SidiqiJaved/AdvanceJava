package com.syntax.class09;

public class HWArry4 {

	public static void main(String[] args) {
		/*
			Create an array on integers and calculate the sum of all elements in an array 
	
		 */
		
		
		
		int [] numbers= {12, 14, 16, 97, 20, 2022};
		
		int Largest=0; 
		
		for (int i=0; i< numbers.length; i++)
		{
			if (Largest < numbers[i]) {
				Largest = numbers[i];
			}
			
		}
		System.out.print(" the largest number is " +Largest);
	}

}
