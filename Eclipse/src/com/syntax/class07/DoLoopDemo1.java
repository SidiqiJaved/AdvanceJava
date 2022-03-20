package com.syntax.class07;

public class DoLoopDemo1 {

	public static void main(String[] args) {
	
	System.out.println("  while check condtion before execution");
	
	int num =10;
	
	while (num<=3) { // is more used than do while 
		
		
		System.out.println("Hello ");   // 5 times
		num++;
		
	}
	
	System.out.println("------ Do While check Condtion After Execution");
	
	int num1=10;
	
	do { //is less used than while
	
		System.out.println();
		num1++;
	
	}while (num1<=3);
	System.out.println(" I want to print numbers from 1 to 30 do while loop");
	
	int num3=1;
	do {
		System.out.print(num3);
	num3++;
	
	} while (num3<=30);
	
	
	
	
	
	
	}}
