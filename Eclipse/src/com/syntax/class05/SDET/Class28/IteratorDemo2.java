package com.syntax.class05.SDET.Class28;

import java.util.*;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;

public class IteratorDemo2 {


    public static void main(String[] args) {


        List<String> courses = new LinkedList<>();

        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");

        Iterator<String> iterator = courses.iterator();
        out.println(iterator.hasNext());
        out.println(iterator.next());
        out.println(iterator.hasNext());
        out.println(iterator.next());
        out.println(iterator.hasNext());
        out.println(iterator.next());
        out.println(iterator.next());
    }
}

