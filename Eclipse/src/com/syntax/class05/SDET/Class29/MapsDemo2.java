package com.syntax.class05.SDET.Class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {

        Map<String, Integer> fruit =new HashMap<String, Integer>(  );

      fruit.put("Bannana", 3123);
      fruit.put("Apple", 31223);
      fruit.put("poppoye", 31123);
      fruit.put("Gripes", 31234);

        System.out.println(fruit );
        System.out.println(fruit.get(3123) );
    }
}
