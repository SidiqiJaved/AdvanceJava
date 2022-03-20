package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean allergy = false;
		if (allergy) {

			System.out.println(" Lest check what allergies do you have ");

			String allegeryType = "nop";

			if (allegeryType.equals("pollen")) {

				System.out.println(" Please stay at home . you need to rest");

			} else if (allegeryType.equals("peanut")) {

				System.out.println("You have nuts allergy");
			} else if (allegeryType.equals("gluten")) {

				System.out.println(" You need to stay away from bread");
			} else {
				
		}
	}System.out.println(" you are lucky");
}
}
