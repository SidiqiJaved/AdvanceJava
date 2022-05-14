package com.reviewclass13;

public class MethodsDemo {

	// void is  a type of methods that dont return anything when called
	///
	
	
	void checkEvenOdd(int number) {

		
		if (number %2 ==0 ) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	
	void study(boolean isRaining) {
		if(isRaining) {
			System.out.println(" I am studying ");
		}else {
			System.out.println("lets go for a walk");
		}
	}
	
	// create a method to check a name if a name is Maha it prints 
	// send memes otherwise if name is Sophia I am a doctor
	
	
	
	void checkPerson(String name) {
		if ("Maha".equals(name)){
			System.out.println("meme");
			
		}else if ("Sophia".equals(name)){
System.out.println("Doctor");
	}else{
		System.out.println("Unknown");
	}
	
	}
	
	public static void main(String[] args) {

		
		
		MethodsDemo object =new MethodsDemo ();
		
		object.checkEvenOdd(121);
		object.checkEvenOdd(12564);
		object.checkEvenOdd(21);
		object.checkEvenOdd(9736);
		object.study(false);
		
		object.checkPerson("Maha");
		
		object.checkPerson("Sophia");
		
	}

}
