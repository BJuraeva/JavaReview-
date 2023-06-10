package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E2Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // not duplicate keys are allowed
        map.put("Apple", 3);
        map.put("Kiwi", 2);
        map.put("Orange",4);
        map.put("Mango", 3);
        map.put("Apple", 30);
        System.out.println(map); // {Apple=30, Kiwi=2, Mango=3, Orange=4}
        map.remove("Orange");
        System.out.println(map); // {Apple=30, Kiwi=2, Mango=3}

        Set<String> keys = map.keySet();
        keys.removeIf(x->x.contains("a") || x.contains("A"));
        System.out.println(map); // {Kiwi=2}

    }
}
