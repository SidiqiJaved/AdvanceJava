package com.syntax.class06;

public class MorePReviousClassTask {
	
	public static void main(String[]args) {
		
		
		/*
		 * find the largest number from three inputs and then find out if it is even or Odd
		 * 
		 * 
		 * 
		 */
		
		
		
		int num1=(int)10000000.00;
		int num2=5440004;
		int num3=56465;
		
		
		int largest=0;
		
		
		
		if (num1>num2 && num1 > num3) {
			
			largest=num1;
			
		} else if (num2>num1 && num2>num3) {
			largest=num2;
			
			
			
			
		} else if (num3>num1 && num3>num2) {
			largest =num3;
			
			
			
		}
		System.out.println(largest+" is the largest number");
		if (largest%2==0) {
			System.out.println(largest+"is even number");
		}else {
			System.out.println(largest+" is a odd number");
		}
		
		
	}

}
