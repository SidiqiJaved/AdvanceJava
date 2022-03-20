package com.syntax.class04;

import java.util.Scanner;

public class TakeIn {
	
	public static void main (String[]args) {
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println(" Please enter where are you from?");
	
	//  to capture String valu in Scanner, we should use next
		
		
			String Country =scan.next();
			
			System.out.println("You are from " + Country);
		
			
			if (Country.equals("USA")) {
			System.out.println("You Speak English ");
			} else if ( Country.equals("Afghanistan")) {
				
				System.out.println(" YOU SPEAK PASHTO");
			} else {
				
				System.out.println(" I am not sure, what language do you speak");
			}
				
	}

}
