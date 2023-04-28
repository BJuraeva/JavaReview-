package com.syntax.review6;

public class Task10 {
    /*
    Write a program to print out duplicate elements from
    an Array of Strings?
     */
    public static void main(String[] args) {
        String [] arr={"dog","cat","lion","dog","tiger","cat","bird"};


        for (int i = 0; i < arr.length ; i++) { //true

            for (int j =i+1; j < arr.length; j++) {// true

                if(arr[i].equals(arr[j])) { // true

                    System.out.println(arr[j]);

                }

            }
        }

    }
}
