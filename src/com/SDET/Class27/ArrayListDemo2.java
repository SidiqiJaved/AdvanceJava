package com.SDET.Class27;

import java.util.ArrayList;
import static java.lang.System.out;

public class ArryListDemo2 {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(10.85);
        numbers.add(100.65);
        numbers.add(1.5);
        numbers.add(12.9);

        out.println(numbers.get(2));

        numbers.remove(2);
        out.println(numbers);
        out.println(numbers.size());

        for (Double number : numbers ){
            out.println(number);
        }
    }
}
