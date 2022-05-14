package com.syntax.class05.SDET.Class27;
import static java.lang.System.out;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("apple");

        ArrayList<String> vegetables = new ArrayList<>();

        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Okra");
        vegetables.add("Tomato");

        ArrayList <String>   groceries = new ArrayList<>();

        groceries.addAll(fruits);
        groceries.addAll(vegetables);

        out.println(vegetables);

        ArrayList <String> itemsToBeRemoved = new ArrayList<>();

        itemsToBeRemoved.add("a");




    }
}
