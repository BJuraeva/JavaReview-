package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E3Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // not duplicate keys are allowed
        map.put("Apple", 3);
        map.put("Kiwi", 2);
        map.put("Orange",4);
        map.put("Mango", 3);
        map.put("Banana", 30);
        System.out.println(map); // {Apple=3, Kiwi=2, Mango=3, Orange=4, Banana=30}
        map.values().removeIf(x->x>3);
        System.out.println(map); // {Apple=3, Kiwi=2, Mango=3}

    }
}
