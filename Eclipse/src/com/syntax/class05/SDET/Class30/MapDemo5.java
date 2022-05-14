package com.syntax.class05.SDET.Class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {



        HashMap<String, Double> fruitMap = new HashMap<>(  );

        fruitMap.put("Apple",54.00);
        fruitMap.put("Banana", 10.2) ;
        fruitMap.put("Kiwi", 10.2) ;
        fruitMap.put("Apple", 100.02) ;
        fruitMap.put("Watermelon", 1.2) ;
        fruitMap.put("Coconut", 6.2) ;
        fruitMap.put("Mango", 90.2) ;
        fruitMap.put("Orange", 20.0) ;
// fruitMap.entrySet(); is a box we have boxes with keys and values
        System.out.println(fruitMap.entrySet());
        /// getting the enteries aka small box that can contain the keys and values
        for (Map.Entry<String,Double> entry: fruitMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }




    }
}