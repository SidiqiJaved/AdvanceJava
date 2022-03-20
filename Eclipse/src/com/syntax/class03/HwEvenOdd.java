package com.syntax.class03;

import java.util.Scanner;

public class HwEvenOdd {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		
		int num = scan.nextInt();

		if (num % 2 == 0) {

			System.out.println("Number is Even ");

		} else
			System.out.println("Number is Odd");

	}

}
