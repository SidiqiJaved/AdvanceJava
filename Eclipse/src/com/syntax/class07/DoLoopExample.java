package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
	/// create a secret number
	
	/*
	 *  user to guess secret number

	 * the moment user guess the secret number my program should top  
	 * otherwise continue guessing my number
	 */
	
		
		
		
		
		
		int secretNumber=12;
		
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
		
		do {
			System.out.println(" please enter the number to win my heart");
			guessNumber=scan.nextInt();
			
		} while (guessNumber!=secretNumber);
		
		System.out.println(" Congrats bitch");
	
	}

}
