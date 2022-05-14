package com.syntax.Class12;

public class Horse {

	
	
	
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	
	
	
	
	void run() {
		System.out.println(name + " is running");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	
	void printcompleteInfo() {
		
		System.out.println("name = " + name );
		System.out.println("breed = " + breed );
		System.out.println("age = " +age );
		System.out.println("weight = " +weight );
		
	}
	
	public static void main(String[] args) {
		
		
		
		Horse besh = new Horse ();
		
		
		besh.name = " Besh";
		besh.breed = " Mustang";
		besh.age= 20;
		besh.weight = 800;
		besh.run();
		
		besh.printcompleteInfo();
		 
		
		 System.out.println("**********");
		 System.out.println("**********");

		 System.out.println("**********");

		 
		 System.out.println("**********");


		 
		 
		 Horse MrHorse=new Horse();
		 
		 MrHorse.name="Wafadar";
		 MrHorse.breed="Mustang";
		 MrHorse.age=14;
		 MrHorse.weight=122;
		 MrHorse.run();
		 
	MrHorse.printcompleteInfo();
		 

	}

}
