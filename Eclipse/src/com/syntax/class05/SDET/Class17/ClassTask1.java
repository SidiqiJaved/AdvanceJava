package com.syntax.class05.SDET.Class17;

public class ClassTask1 {
    public static void main(String[] args) {
        /*
         Create a String that will hold a sentence.
         Write a program to get a new String without any spaces.
         */

        String s="This is sentence";
        String newStr=s.replace(" ", "");
        System.out.println(newStr);
    }

}
