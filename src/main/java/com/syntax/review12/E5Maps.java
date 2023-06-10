package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;

public class E5Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // not duplicate keys are allowed
        map.put("Apple", 3);
        map.put("Kiwi", 2);
        map.put("Orange",4);
        map.put("Mango", 3);
        map.put("Banana", 30);
        map.forEach((key,value)-> {System.out.println(key+" "+value);});
          /*
           if(key.contains("a")&& value>4){
               System.out.println(key+" "+value); // Banana 30
           }
        });*/
    }
}
