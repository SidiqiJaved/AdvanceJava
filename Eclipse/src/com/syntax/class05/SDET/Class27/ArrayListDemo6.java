package com.syntax.class05.SDET.Class27;
import java.util.ArrayList;

import static java.lang.System.out;

public class ArrayListDemo6 {
    public static void main(String[] args) {

        ArrayList<String> groceries=new ArrayList<>();

        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Apple");
        list2.add("Oniion");

        out.println(groceries.containsAll(list2));


    }
}
