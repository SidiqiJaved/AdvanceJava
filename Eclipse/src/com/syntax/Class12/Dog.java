package com.syntax.Class12;

public class Dog {
	
	
	
	// artibutes, fields, properties
			String name;
			String color;
			String bread;
			char gender;
			int age;
			double weight;
			
			
			
			// behaivor , function, method
			
			void bark() {
				System.out.println(" Dog is braking");
			}
	

			
			void eat() {
				System.out.println(" dog is eating");
			}
			
			void sleep() {
			
			System.out.println(" dog is sleeping");
			}
			
	public static void main(String[] args) {
		
		// creating an object shephered from class Dog
	
		Dog shephered= new Dog();
		
		// Dog is a class
		// shephered is an object
		// = is assignment operator
		// new is keyword that we use to create the object of a class
		// Dog() we are calling the constructor of the class
	

		shephered.bark();
		
		shephered.sleep();
		shephered.eat();
		
	

	}

}
