package com.syntax.class05.SDET.Class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {


        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("orange");
        fruit.add("Banana");
        fruit.add("Apple");

        System.out.println(fruit);

    }
}
