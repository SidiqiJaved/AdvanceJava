package com.syntax.class09;

public class ClassReview {

	public static void main(String[] args) {

		
		for (int i =1; i<=4; i++) {
			
			System.out.println("A");
			
			//break;
			
			
			System.out.println("B");
		}
		
		
		System.out.println(""); 		System.out.println(""); 		System.out.println("");

 
		for (int i=1; i <=4; i++) { // outer loops controls number of complete iteration of inner loops 
			
			for (int j = 1;  j <=4; j++) {   // inner loops always depends on outer
			
			System.out.println("Hello");
			
		break;
			}
			{
			System.out.println("Good mornig America");
		}
			break;
		}
		
		
		
		for (int i=0; i<=3; i++) {
			
			for (int j=0; j <=4;  j++) {
				System.out.println(" checking");
				
				continue;
			}
			System.out.println(" useless");
		}
	}
}

