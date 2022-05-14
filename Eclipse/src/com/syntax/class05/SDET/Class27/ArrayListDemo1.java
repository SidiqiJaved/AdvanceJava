package com.syntax.class05.SDET.Class27;

import java.util.ArrayList;

import static java.lang.System.out;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList <Double> numberList = new ArrayList<>();

        Double double1 = new Double(10.5);
        double number = double1.doubleValue(); //unboxing
        Double number2 = new Double(number); // boxing
        double number3 =10.5; //autoBoxing
        Double number4 = number3;
        number3 = number4; // AutoUnBoxing

        out.println(number); // impressive
    }
}
