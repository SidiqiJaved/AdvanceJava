package com.syntax.class05.SDET.Class16;

public class ClassReview {
    public static void main(String[] args) {
        // How would you check if String is palindrome or not?
        //Example1: aba ---> true aba
        // Example2: Abbc --> false cbbA
        ClassReview task=new ClassReview();
        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("Abbc"));

    }

    boolean isPalindrome(String inputStr){
        String reversedStr=reverseString(inputStr);// reversing a word
        return reversedStr.equals(inputStr); // checking if words are same

    }

    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
