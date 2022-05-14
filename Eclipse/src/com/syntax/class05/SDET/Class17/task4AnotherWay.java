package com.syntax.class05.SDET.Class17;

public class task4AnotherWay {
    public static void main(String[] args) {

        String s= "Sunday is great";
        String []strArray=s.split(" ");
        for (int i=0; i < strArray.length ; i++){
            System.out.println(strArray[i]);
        }
    }
}
