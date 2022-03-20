package com.syntax.class10;

public class ClassTask2DArray {

	public static void main(String[] args) {
		
	
		 String[][] name =new String[2][4];
		
		name[0][0]="Mr ";
		name[0][1]="Mrs ";
		name[0][2]="Ms ";
		name[0][3]=	"Mis s";
		
		name[1][0]="Smith";
		name[1][1]="Jordan";
		name[1][2]="Jackson";
		name[1][3]="Obama";
		
		System.out.println(name [0][1]+ name[1][0] ); 
		System.out.println(name [0][3]+ name[1][1]);
		System.out.println(name [0][2]+ name[1][2]);
		System.out.println(name [0][0]+ name[1][3]);
		
		///or another way 
		System.out.println("");
		
		String [] [] name1={
				{"Mr", "Mrs", "Ms", "Miss"},
				{" Smith", " Jordan", " Jackson", " Obama"}
				
			
		};
		
		
		System.out.println(name1 [0][1]+ name1[1][0]);
		System.out.println(name1 [0][3]+ name1[1][1]);
		System.out.println(name1 [0][2]+ name1[1][2]);
		System.out.println(name1 [0][0]+ name1[1][3]);
		
		
		
	}

}
