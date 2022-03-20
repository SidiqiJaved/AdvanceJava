package com.syntax.class09;

public class ClassTaskArray {

	public static void main(String[] args) {
	
			
		
		double[] price= new double[4];
		
		price[0]=1.99;
		price[1]=2.99;
		price[2]=3.99;
		price[3]=4.99;
		
		
		System.out.println((price[0] + price[1] + price[2] + price[3])/4);
		
		//or another way to find the average
		
		double average=(price[0] + price[1] + price[2] + price[3])/4;

		System.out.println(average);

	}

}
