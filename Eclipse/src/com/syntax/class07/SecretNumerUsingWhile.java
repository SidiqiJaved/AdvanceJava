package com.syntax.class07;

import java.util.Scanner;

public class SecretNumerUsingWhile {
	
	public static void main(String []args) {
		
		
int secretNumber=12;
		
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		
	
			System.out.println(" please enter the number to win my heart");
			
			guessNumber=scan.nextInt();
			
		 while (guessNumber!=secretNumber) {
		
		System.out.println(" please enter the number to win my hear");
		guessNumber=scan.nextInt();
	
	}
	System.out.println( " Congratulations ");	
		
		
	}

}
