package com.syntax.class05.SDET.Class29;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task3 {
    public static void main(String[] args) {


        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */

        LinkedHashSet <String> cities = new LinkedHashSet<>(  );

        cities.add ("Arlington");
        cities.add (" Alexnadria ");
        cities.add (" DC ");
        cities.add (" Baltimore ");
        cities.add (" McLean ");
        cities.add (" Madison ");
        cities.add (" London ");
        cities.add (" New York ");
        cities.add (" Kabul ");
        System.out.println(cities );

//  cities.removeIf(x -> x.startsWith("A")); // recommended
        System.out.println(cities);
        Iterator<String> iterator= cities.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }

    }
}
