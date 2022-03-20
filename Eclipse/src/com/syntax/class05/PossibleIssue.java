package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {
public static void main(String[]args) {
	
	
	//next () vs nextLine();
	
Scanner scan =new Scanner(System.in);




	System.out.println("Capturing values using next");
	
	String value=scan.next();
	System.out.println(value);
	
	
	System.out.println("Caputring values using nextLine");
	
	String	AnotherValue=scan.nextLine();
	System.out.println(AnotherValue);
	
	
	System.out.println("End of code");
}
}
