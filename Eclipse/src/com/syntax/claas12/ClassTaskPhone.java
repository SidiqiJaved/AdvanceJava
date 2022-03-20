package com.syntax.claas12;

public class ClassTaskPhone {


	
	String name;
	String model;
	int  Pixel;
	
	
	
	void Performance() {
		System.out.println(name + " is performing perfectly fine. ");
	}
	
	void badcondition() {
		
		System.out.println(name + " is in very poor condition, ");
	}
	
	
	void goodCondition() {
		
		System.out.println(name + " is in perfect condition");
	}
	 void allinfo() {
		 
		 System.out.println(" My Phone is " + name);
		 System.out.println("My Phone is model " +  model + " ");
		 System.out.println(" My Phone is very high " + Pixel+ " 152");
		 
	 }
	
	
	
	public static void main(String[] args) {
		
		
		ClassTaskPhone iPhone=new ClassTaskPhone ();
		
		iPhone.name="Apple";
		iPhone.model="13";
		iPhone.Pixel= 22;
		
		iPhone.goodCondition();
		iPhone.Performance();
		System.out.println(iPhone.model +  iPhone.Pixel);
		
		
		System.out.println("");
		System.out.println(" ********  ");
		System.out.println("");
		
		ClassTaskPhone Samsung=new ClassTaskPhone ();
		
		Samsung.name="Edge";
		Samsung.model=" Yo Yo 1245";
		Samsung.Pixel=128;
		
		
	 Samsung.badcondition();
	 
	 Samsung.Performance();
	Samsung.allinfo();
		
	
	
	System.out.println("");
	System.out.println(" ********  ");
	System.out.println("");
	
	ClassTaskPhone Nokia=new ClassTaskPhone ();
	
	 Nokia.Performance();
	Nokia.allinfo();
	Nokia.goodCondition();

	}

}
