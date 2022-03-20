package com.syntax.class10;

public class ClassTask2Darray2 {

	public static void main(String[] args) {
		
		
		
		int [][] numbers= {
				{10, 20, 30, 40},   //index 0
				{100, 200, 300, 40, 50, 60},   /// index 1
				{1000, 2000}   //index2
				
				
		};
		
		int size=numbers.length; // when we use with 2d arrays it prints stored rows
		System.out.println(size);  /// prints number of rows 
	
	
		int sizeof1Array=numbers[0].length;
		System.out.println(sizeof1Array); /// 4 are the elements stored in first array
		
		
		
		int sizeof2Array=numbers[1].length;  /// 6 numbers are the eliment stored in the second array
		System.out.println(sizeof2Array);
		
		int sizeof3Array=numbers[2].length;
		System.out.println(sizeof3Array);
		
		
		/// retrieving all elements from 2D array
		
		
		for (int i=0; i< numbers.length; i++) {
			for (int j=0; j < numbers[0].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
		
	}

}
