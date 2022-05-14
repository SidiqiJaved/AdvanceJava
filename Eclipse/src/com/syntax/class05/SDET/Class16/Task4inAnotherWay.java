package com.syntax.class05.SDET.Class16;

public class Task4inAnotherWay {
    public static void main(String[] args) {
        String s= "Sunday is great";
        String []strArray=s.split(" ");
        for (int i=0; i < strArray.length ; i++){
            System.out.println(strArray[i]);
        }
    }
}
