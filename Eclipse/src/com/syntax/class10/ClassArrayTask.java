package com.syntax.class10;

public class ClassArrayTask {

	public static void main(String[] args) {
		/// create an array and retrieve all elements in reverse order 
		
		
		int []elements={1,2,3,4,5,6};
				
		for (int i=elements.length -1;  i >= 0; i--) {
			
			System.out.println(elements[i]);
			
		}
		
		
		// or another way to solve it i s
		
		int[] arrs= {4,68,2,3,4};
		for(int i=0; i<arrs.length; i++ ) {
			System.out.print(arrs[arrs.length-i-1]+" ");
	
	}
	}
}
