package com.syntax.class05;

public class LogicalNOT {

	public static void main(String[] args) {

		
		// Logical not is used to revert the condition 
		
		
		boolean value=!false;
		System.out.println(value);
		
		System.out.println("****************");
		
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will come on time to work");
		}
		
		
		
		
		System.out.println("************");
	
	
	String day="Saturday";
	if (!day.equalsIgnoreCase("Saturday")) {
		System.out.println("Today is not Saturday");
	}
	
	boolean checkboxChecked=false;
	if(!checkboxChecked) {
		System.out.println("I will click on that checkbox");
	}
	
	
	System.out.println("_______ the END _______");
	}

}
