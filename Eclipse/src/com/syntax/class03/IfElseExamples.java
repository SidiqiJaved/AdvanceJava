package com.syntax.class03;

public class IfElseExamples {

	public static void main(String[] args) {
	

		
		/*
		 *  if hungy will go to eat and if not then drinking tea
		 * 
		 */
		
		boolean hungry =true;
		
		if (hungry ==false) {
			
			System.out.println(" I am going to eat some yummy food");
		}else {
			
			System.out.println(" hell no, I am going to have an espress");
		}
		
		// we can write boolean value with out comparing with another like this 
		
		System.out.println("");

		boolean hungry1 =false;
		
		if (hungry1) {
			
			System.out.println(" I am going to eat some yummy food");
		}else {
			
			System.out.println(" hell no, I am going to have an espress");
		}
	
	
	boolean traffic=false;
	
	
	if (traffic ){
		
		System.out.println(" i will be late");
	}else
		System.out.println("I will be there in few");
	
	
	
	/*
	 * define a variable to store a browser 
	 * 
	 * if browser is chrome --> we are executing test on chrome 
	 * other wise , browser is not supported for testing
	 * 
	 */
	System.out.println("");
	
	
	// ALWAYS USE .EQUAL TO COMPAURE TO STRINGS VALUES 
	String browser="chrome";
	
	
	
	if (browser.equals("chrome")) {
	
		
		
		// .EQUALS AND == WORK THE SAME BUT .EQUAL IS PREFERED FOR STRINGS
		System.out.println(" we are executing test on chrome");
	} else {
		
		System.out.println(" our test does nt work on other browswers");
	}
	
	if (browser=="chrome") {
		
		System.out.println("System works");
		
	} else {
		
		System.out.println(" it doenst work ");
	}
	
	
	
	}

}
