package com.syntax.homework;

import java.util.Scanner;

public class ArryHW6 {
	
	public static void main (String []args) {
		
		//Write a java program to check whether a given number is prime or not?
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("PLease Enter size of Rows");
		
		int Row, Column;
			Row=input.nextInt();
			System.out.println("PLease Enter size of Columns");
			Column=input.nextInt();
			
		
			int [] [] arr=new int [Row][Column];
			

		System.out.println("Please Enter value of the 2D Array ");
		
		for (int i=0; i < arr.length; ++i) {
				for (int j=0; j<arr[i].length; ++j) {
						arr[i][j]=input.nextInt();
				}
							
			
		}
		
System.out.println("Your 2D Array is  ");
		
		for (int i=0; i < arr.length; ++i) {
				for (int j=0; j<arr[i].length; ++j) {
					
System.out.println(arr [i][j]+ "");
		
				}
				System.out.println();
	}
		

		for (int i=0; i < arr.length; ++i) {
				for (int j=0; j<arr[i].length; ++j) {
					
					if 	(arr[i][j] %2==0) {
						System.out.println(arr[i][j]+ "Even number ");
					}
					
					else {
						System.out.println(arr [i][j]+ " Odd Number");
					}
				}
				System.out.println();
		}
	}
	
}
