package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[]args) {
		
		
		
		int num1=10;
		int num2=16;
		
		System.out.println(num1>num2); //false
		System.out.println(num1==num2); //false
		System.out.println(num1<num2);  //true
		
	
		
		boolean result=num1 != num2;
		
		System.out.println(result);
	
		
		System.out.println();
		
		System.out.println(num1=num2); // value of num1/10 changed to num2/16 and in the line bellow they are true
		
		System.out.println("the new value of num1 is changed to num2 " + num1);
		
		System.out.println(num1==num2);   /// here the 16 from line 16 is equal to num2 which value is 16
		
		
		System.out.println(num1 != num2); /// the result should be false, since  valued changed
		
	
	
	
	}

}
