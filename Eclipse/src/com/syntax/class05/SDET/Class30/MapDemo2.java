package com.syntax.class05.SDET.Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {

        HashMap <String, Double> fruitMap = new HashMap<>(  );
        fruitMap.put("Apple",54.00);
        fruitMap.put("Bannna", 10.2) ;
        fruitMap.put("Kiwi", 10.2) ;
        fruitMap.put("Apple", 10.02) ;// duplcate values are reassigned
        fruitMap.put("Watermelon", 1.2) ;
        fruitMap.put("Coconut", 6.2) ;
        fruitMap.put("Mango", 90.2) ;
        fruitMap.put("Orange", 102.5) ;


       Set<String> keys= fruitMap.keySet();

        System.out.println(keys );
        Iterator<String> iterator = keys.iterator();
    while (iterator.hasNext()) {

        if (iterator.next().contains("e")){
            iterator.remove();
        }
    }
        System.out.println(fruitMap );
    }
}
