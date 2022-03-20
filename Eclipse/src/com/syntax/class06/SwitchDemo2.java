package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		
		
		
		
		char choice ='N';
		String answer;
		
		
		switch (choice) {
		
		case 'y':
			answer="Yes";
			break;
			
		case 'n':
			answer="No";
			break;
		
		case 'm':
			answer="Maybe";
			break;
			
			default:
				answer="Unknown";
			break;
			
			
		}
		
		System.out.println(answer);
		
		
					System.out.println("");

					System.out.println("");	

					System.out.println("");

					
					String car="honda";
					String country;
					
					switch (car) {
					case "BMW":
						country="Germany";
					break;
					
					
					case"Ford":
						country="USA";
						break;
						
					case "Lade":
						country="Russia";
						break;
						
					case "Toyota":
						country="Japan";
						break;
						
						default:
							country="Uknown";
						
					}
					
			System.out.println(car + " is from " + country );		
					
	}
}
