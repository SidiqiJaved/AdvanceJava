package com.syntax.class05.SDET.Class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {

        ArrayList<String> Vegeies = new ArrayList<>(  );

        Vegeies.add("potato");
        Vegeies.add("Carrot");
        Vegeies.add("Onion");
        Vegeies.add("Parsley");

        ArrayList<String> fruit = new ArrayList<>(  );

        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Mango");


        Map<String, ArrayList<String> > HealthyFood = new HashMap<>(  );

        HealthyFood.put("Vegeies", Vegeies);
        HealthyFood.put("Fruit",fruit);

        System.out.println(HealthyFood );


    }

}
