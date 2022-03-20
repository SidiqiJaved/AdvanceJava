package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

		
		//boolean likeJava=true;
		//
		//boolean understandJava=false;
		//if (likeJava && understandJava) {
		//	System.out.println(" The best combination");
			
			
			
			// compare 3 numbers to find the largest
		
		
		/*
		 * if num1> num2> &&  num1>num3 ....> num1 is the largest
		 * 
		 * what if num2>num1 && num2>num3.... num2 is the largest 
		 * 
		 * what if num3>num1 && num3> num2.... num3 is the largest 
		 * 
		 */
		
			
			
		int num1 =111111;
		int num2=2200;
		int num3=100;
		
		
		if (num1>num2 && num1>num3) {
			
			System.out.println("Num1  " +num1+ " is the lagest");
		} else if (num2>num1 && num2>num3) {
						System.out.println("Num2 " + num2+" is the largest");
		
		}else if (num3>num1 && num3>num2) {
		System.out.println(num3+ " is the largest");
		
		}
		
		
		}
		
		
		
		//System.out.println("End of the Code");
	}

//}
