package com.syntax.homework;

import java.util.Scanner;



public class Class6HW1 {
	
	public static void main(String[]args) {
		
		
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, 
		 * C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 * */
		
		
		Scanner in=new Scanner(System.in);
		
		System.out.println(" Please select your Grade from: A, B, C, D,..");
		
		char grade=in.next().charAt(0);
		String reward=in.nextLine();
		
		switch (grade) {
		case 'A':
			reward="Excellent";
			break;
			
		case 'B':
			reward="Good";
			break;
		
		case'C':
			reward="Averge";
			break;
			
		case'D':
			reward="Poor";
			break;
		
			
		default:
			reward="You need to stay focus in the class";
			
		}
		
			
			
		
		
			System.out.println("Congratulation you have passed "+ grade+ " with   " +reward);
		
		
	
			
		
		}
		
	
		
	}

