package com.syntax.class04;

public class ClassTaskIfNested {

	public static void main(String[] args) {

		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output should
		 * say “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” .
		 */

		boolean diploma = false;

		if (diploma) {

			System.out.println("Congratualtions");

			double gpa = 3.5;

			if (gpa <= 3.4) {
				System.out.println(" you are eleigble for scholar ship");
			} else {
				System.out.println(" YOu should work hard");

			}
		} else {

			System.out.println(" Please Get a Degree! ");
		}

	}

}