package com.syntax.class09;

public class MorArrayExamples {

	public static void main(String[] args) {

		
		
		String[] cities= {"NYC", "Alexandria", "Vegas", "Miami"};
		
		
		for (int a=0; a< cities.length; a++){
			
			System.out.print(cities[a] + " , ");
			
			if (cities[a].equals("Vegas")){
				System.out.println(" I love to live in Miami");

				
			}
		}
	}

}
