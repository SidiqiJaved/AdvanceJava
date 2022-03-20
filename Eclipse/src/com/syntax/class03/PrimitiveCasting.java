package com.syntax.class03;

public class PrimitiveCasting {
	
	
	public static void main (String[]args) {
		
		
		
		int i=10;
		double d=10;
		
		System.out.println(i); // 10
		System.out.println(d); // 10.0
		
		/* 2 types of casting
		 * Casting is the process of converting the value from one type to another
		 *
		 * Widening/ Implicit/ Automatic (Convert small num into bigger)
		 * byte->short->int->long->float->double
		 *
		 * Narrowing/ Explicit/ Manual (Convert big num into smaller num)
		 * double->float->long->int->short->byte
		 */
		System.out.println("************************Narrowing***********************************");
		
		int num=(int)10.99; // *Must state what variable you want to change to ex:(int)10.99;
		System.out.println(num); // 10
		
		float f=(float)10.99; // or float f=10.99f;
		System.out.println(f);
		
		byte b=(byte)1000;
		System.out.println(b); // -1000
		
		
		long number =(int)115687687546l;
		System.out.println(number);
		
		//narrowing 
		int numb=(int)23134354321l;
		System.out.println(numb);
		
		
	}

}
