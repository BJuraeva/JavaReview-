package com.syntax.review6;

import java.util.Arrays;

public class Task9 {
     /*
    Write a java program to find the second largest
    number in the array?
     */
     public static void main(String[] args) {
         int[] arr={100,-6,44,8,8,10,80};
         int largestNum=0;
         int secondLargestNum=0;

         for (int i = 0; i < arr.length; i++) {

             if(arr[i]>largestNum){
                 secondLargestNum=largestNum;
                 largestNum=arr[i];

             }else if(arr[i]>secondLargestNum && arr[i] !=largestNum){
                 secondLargestNum=arr[i];
             }
         }
         System.out.println( secondLargestNum);

         System.out.println("======================================");

         int num[]={3,2,45,6};
         Arrays.sort(num); // easiest rout to find second largest number with the method
         System.out.println(num[num.length-2]);
     }
}
