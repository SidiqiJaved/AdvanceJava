package com.syntax.class05.SDET.Class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {

        ArrayList<String> countries= new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Afghanistan");
        countries.add("Gana");
        countries.add("Iraq");
        countries.add("Japan");

        System.out.println(countries.get(2));
        System.out.println(countries.get(3));
        System.out.println(countries.get(0));
        System.out.println(countries);
        countries.add(3,"Pakistan");
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("Pakistan");
        System.out.println(countries);
        countries.clear(); // removes all arrays and will print empty empty Array []
        System.out.println(countries);



    }
}
