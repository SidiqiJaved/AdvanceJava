package com.syntax.class05.SDET.Class27;
import static java.lang.System.out;

import java.util.ArrayList;
public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList<String> groceries=new ArrayList<>();

        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);

    }

}
