package com.syntax.class04;

import java.util.Scanner;

public class UserInput {
	
	
	public static void main (String []args) {
		
		
Scanner input =new Scanner (System.in);


System.out.println("Please enter your name");
		
		
		String name=input.next();
		System.out.println("  Your Name is " + name);

		
		// if you want to capture int value 
		System.out.println(name + " please enter your age");
		
		int age=input.nextInt();
		
		System.out.println(" your name is " + name + " your age is " + age);
}

}
