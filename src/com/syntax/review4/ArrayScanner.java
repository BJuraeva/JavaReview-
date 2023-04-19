package com.syntax.review4;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        /*
        1) Create an array that stores numbers from a user
        2) and then we want to calculate the average of numbers
         */
        Scanner scan=new Scanner(System.in);
        System.out.println(" How many integers you want to store");

        int size=scan.nextInt(); // user define the size of the array

        int [] numbers=new int [size];
        // user enter the value i want to store inside the array
        // since I do repetitive action I need loop

        for (int i = 0; i < size; i++) { // option length works only with array "size"or"number.length"
            System.out.println("Please enter "+(i+1)+" element");
            numbers[i]=scan.nextInt(); // next int can only capture one value
        }

        for( ){

        }



    }
}
