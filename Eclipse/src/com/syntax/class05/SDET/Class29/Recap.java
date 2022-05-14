package com.syntax.class05.SDET.Class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Recap {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>(  );
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("C");
        arrayList.add("C");


        LinkedHashSet <String> linkedHashSet = new LinkedHashSet<>( arrayList );
        System.out.println(linkedHashSet );

        TreeSet <String> treeSet = new TreeSet<>( arrayList );
        System.out.println(treeSet );
        arrayList.clear();   // Removing all the original elements

        arrayList.addAll(linkedHashSet);    // adds all unique with the inseration order
        System.out.println("Array" );

        System.out.println(arrayList );
    }
}
