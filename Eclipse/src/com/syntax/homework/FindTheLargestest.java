package com.syntax.homework;

import java.util.Scanner;

public class FindTheLargestest {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		
		
		
		System.out.println("Please enter 3 diffrent numbers");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
			

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("From the numbers entered, "+num1 + " is the largest number");
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("From the numbers entered, "+num2 + " is the largest number");
			} 
			else {
				System.out.println("From the numbers entered, "+num3+" is the largest number");
			}
		} 
	}

}
