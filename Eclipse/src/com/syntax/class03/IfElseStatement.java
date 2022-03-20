package com.syntax.class03;

public class IfElseStatement {

	
	public static void main(String[]args) {
		
		int num1 =100;
		int num2=5000;
		
		
		// which number is largest 
		
		
		if (num1 > num2 ) {
			
			System.out.println(num1 + " is larger than "+ num2);
			
		} else {
			
			System.out.println(num2 + " is larget than " +num1);
		}
		
		
		System.out.println("");
		
		// i f temp is more than 45 i am going for a walk other wise no 
		
		
		int temp = 45;
		
		if (temp > 46) {
			
			System.out.println("I am going for a walk");
			
				} else {
					
					System.out.println(" I am staying at home ");
				}
		
		
		System.out.println("");
		
		
		char gender= 'f';
		
		if (gender== 'm') {
		
		System.out.println("Please be seated in the front row");
		}else {
			
			
			System.out.println(" you are a germ , go  to back row");
		}
	}
}
