package com.SDET.Class27;
import java.util.ArrayList;

import static java.lang.System.out;

public class ClassTask1 {
    public static void main(String[] args) {
/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
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
