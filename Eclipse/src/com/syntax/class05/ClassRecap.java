package com.syntax.class05;

import java.util.Scanner;

public class ClassRecap {

	
	public static void main (String[]args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Plese enter your name");
		String name=scan.next();
		
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		
		
		System.out.println("Your name is " + name+ " amd your age is " +age);
		
		
		boolean booleanValue=scan.nextBoolean();

			System.out.println(booleanValue);	
			
			System.out.println("Plese enter decimal value");
			
		double	d=scan.nextDouble();
		System.out.println(d);
		
		
		
		
		System.out.println("Please enter char Value");
		
		char cha=scan.next().charAt(0);
		System.out.println(cha);
		
	}
}
