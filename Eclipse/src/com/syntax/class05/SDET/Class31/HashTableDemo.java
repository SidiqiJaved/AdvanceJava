package com.syntax.class05.SDET.Class31;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

    public static void main(String[] args) {


        Hashtable <String, String> student = new Hashtable<>(  );

        student.put("1", "Emilia");
        student.put("2", "Manila");
        
        student.put("3", "Marina");
        student.put("4", "Parina");
        student.put("5", "Karina");
        student.put("6", "Nania");

        Set<Map.Entry<String, String>> entrySet = student.entrySet( );


        for (Map.Entry<String, String> entry:entrySet)
        {
            System.out.println(entry );
        }
    }
}
