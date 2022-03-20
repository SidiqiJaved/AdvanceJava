package com.syntax.class02;

public class ClassWorkTask2 {

	public static void main(String[] args) {

		double n1;
		double n2;

		n1 = 12.99;
		n2 = 13.99;
	

		System.out.println("********************");
		System.out.println();

		System.out.println("The sum of 2 numbers " + n1 + " and " + n2 + "is equal to " + (n1 + n2));
		System.out.println("The sub of 2 numbers " + n1 + " and " + n2 + "is equal to " + (n1 - n2));
		System.out.println("The multi of 2 numbers " + n1 + " and " + n2 + "is equal to " + (n1 * n2));
		System.out.println("The divi of 2 numbers " + n1 + " and " + n2 + "is equal to " + (n1 / n2));

		System.out.println("********************");
		System.out.println();

		double sq = 3.9;
		sq = sq * sq;

		System.out.println("The square of the of 3.9 is " + sq);

		System.out.println("********************");
		System.out.println();

		int width = 5;
		int height = 8;
		int perimiter = 2 * (width + height);
		int area = width * height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimiter + " and the area " +area);

	}
}
