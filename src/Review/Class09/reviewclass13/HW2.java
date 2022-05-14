package com.reviewclass13;

public class HW2 {

	// Create a method that will take a number and 
	// prints whether the number is even or odd.
	
	
	void Number (int input){
		if (input %2 ==0) {
			System.out.println(" Entry is of even numbers = " + input);
		}else {
			System.out.println(" Entry is of Odd numbers = " + input);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HW2 obj = new HW2();
		
		obj.Number(221);
		

	}

}
