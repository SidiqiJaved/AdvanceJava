package com.reviewclass13;

public class MethodDem2 {

	
	
	
	
	
	// creat a method that takes an animal name and person name if name is equal to 
	//Teyfur and animal is horse
	
	//print camel otherwise print horse
	
	
	
	void teyfurandHorse(String personName, String animalName) {
		if("Teyfur".equals(personName)&& "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("this is a camel");
		}else {
			System.out.println("this is a horse");
		}
	}
	public static void main(String[] args) {
		
		
		MethodDem2 obj= new MethodDem2();
		obj.teyfurandHorse("Teyfur", "Horse");
		obj.teyfurandHorse("Basir", "Horse");
	}

}
