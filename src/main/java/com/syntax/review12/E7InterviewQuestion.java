package com.syntax.review12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class E7InterviewQuestion {

    public static void main(String[] args) {

        // print the number with their count(how many times they appear in the array)
        /*output: 10, 2
                  20, 2
                  30, 2
                  40, 1
                  50, 1
         */
        int [] arr={10,20,10,30,40,50,20,30,70,80,70};
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num:arr){
            if (map.get(num)==null){//if (map.get(num)!=null){
               map.put(num,1);
            }else{
                int count = map.get(num)+1;
                map.put(num,count);
            }
        }
        System.out.println(map); //{10=2, 20=2, 30=2, 40=1, 50=1, 70=2, 80=1}
    }
}
/*
10 appears 2 time(s)
20 appears 2 time(s)
30 appears 2 time(s)
40 appears 1 time(s)
50 appears 1 time(s)
70 appears 2 time(s)
80 appears 1 time(s)
 */
