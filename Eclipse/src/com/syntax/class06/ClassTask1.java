package com.syntax.class06;

import java.util.Scanner;

public class ClassTask1 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("PLease enter your country ");
		
		String country=input.nextLine();
		String language;
		
		
		
		switch (country) {
		
		case "Afghanistan":
			language= "Pashto";
		break;
		
		
		case "Brazil":
			language="Portaguies";
			break;
			
		case"India":
			language="Hindi";
			break;
			
			
			
			default: 
				language="uknown";	
		
				
				
				
		
		

		
					
		}
		
		System.out.println("in " + country + " people speak " + language);
	}
}


