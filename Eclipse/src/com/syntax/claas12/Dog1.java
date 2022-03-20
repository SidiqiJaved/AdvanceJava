package com.syntax.claas12;

public class Dog1 {

	String name;
	String color;
	String bread;
	char gender;
	int age;
	double weight;
	
	void FastR() {
		System.out.println("  is Fast Runner");
	}


	
	void Plays() {
		System.out.println(" Loves to play");
	}
	
	void sleep() {
	
	System.out.println(" sleepes alot ");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Dog1  GermanShephered= new Dog1(); 
		
		GermanShephered.name="Warrior";
		GermanShephered.color=" Khaki";
		GermanShephered.bread= " German Shephered" ;
		GermanShephered.gender= 'F';
		GermanShephered.age = 3;
		GermanShephered.weight= 160;
		
		
		
		
		System.out.println(" The name of my Dog is " +  GermanShephered.name);
		
		
		
	}

}
