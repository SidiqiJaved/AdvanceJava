package com.syntax.class05;

import java.util.Scanner;

public class LogicalTask {

	public static void main(String[]args) {
		
		System.out.println("What day is today?");
		Scanner scan=new Scanner(System.in);
		
		
		String day=scan.nextLine();
	
		
	
		if (day.equals("monday") || day.equals("friday")){
				
			System.out.println(" There is no class today");
		}if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("thursday")){
			
			System.out.println("Today is Manual class");
		}
		
		
		
		
		
	}
}
