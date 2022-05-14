package com.syntax.class05.SDET.Class29;

import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>(  );

        map.put(3231, "Alina");
        map.put(12,"Mohammad");

        System.out.println(map.get(12 ));

        HashMap <Integer, String> groceries = new HashMap<>(  );
        groceries.put(123, "Eggs");

        groceries.put(3456, " Milk, meat, bread, banana, e ");

        System.out.println(groceries.get(3456));
    }
}
