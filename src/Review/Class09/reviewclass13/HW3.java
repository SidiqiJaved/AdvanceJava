package com.reviewclass13;

public class HW3 {

	
	// Create a method that will say Hello in different language based on the country
	// that will passed when method is executed.
	
	
	
	void input(String Country) {
		
		if ("Afghanistan ".equals(Country)) {
			System.out.println("Pashtu");
			
		}else if ("Pakistan " .equals(Country)) {
			System.out.println("Urdu");
		}else {
			System.out.println("Uknown");
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HW3 object =new HW3();
		
		object.input("Afghanistan");

	}

}
