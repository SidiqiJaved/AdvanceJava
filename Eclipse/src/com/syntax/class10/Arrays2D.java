package com.syntax.class10;

public class Arrays2D {

	public static void main(String[] args) {

 // simpel way to do 2d array 
		// 2 D Arrays
		
		
		int [][] numbers = new int [3][4];
		
		
		///1 row or array 
		
		
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		
		// 2nd row or second array
		
		
		numbers[1][0]=100;
		numbers[1][1]=200;
		numbers[1][2]=300;
		numbers[1][3]=400;
		
		// 3rd row or 3rd array
		
		numbers[2][0]=1000;
		numbers[2][1]=2000;
		numbers[2][2]=3000;
		numbers[2][3]=4000;
		
		
		System.out.println(numbers[0][0]);  // to print 300 we need to print row 1 and calumn 2
		
		System.out.println(numbers[0][1]);
		
		
		System.out.println(numbers[2][2]);
		
	
	}

}
