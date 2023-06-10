package com.syntax.review10;

import java.util.ArrayList;

public class CollectionSDemo {
    public static void main(String[] args) {

        String [] names = new String[5]; // for the array specifying size is must

        ArrayList<String> amazonList = new ArrayList<>(); // for arrayList not so important to specify the size (), but putting/not putting makes a lots of changes

        long start =System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            amazonList.add(String.valueOf(i));
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
