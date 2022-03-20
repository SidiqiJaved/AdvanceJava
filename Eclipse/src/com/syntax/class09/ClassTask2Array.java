package com.syntax.class09;

public class ClassTask2Array {

	public static void main(String[] args) {

		
		
		
		char[] grades= new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
	 System.out.println(grades[1]);
	 
	 
	System.out.println("");
	 
	 // OR
	 
	 // how many elements inside array?
	
	 
	 char[]grades1= {'A','B', 'C', 'D'};
	 int size=grades1.length;
	 
	 System.out.println(" Number of elements= " + size);
	 System.out.println(grades1[1]);
	 System.out.println(grades1[2]);
	 System.out.println(grades1[3]);
	 
	 System.out.println("");System.out.println("");
	 
	 for (int i=0; i<grades1.length; i++) {
		 System.out.print(grades1[i] + " ");
	 }
		
		
		
	}

}
