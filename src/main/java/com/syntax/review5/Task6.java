package com.syntax.review5;

import java.sql.SQLOutput;

public class Task6 {
    /*
   Write a java program to check whether a given
   number is prime or not?
   condition : 1) number should be >1
               2) number should be divisible by itself only
       ex: 3 (2), 4(2,3), 5(2,3,4), 6(2,3,4,5)
    */
    public static void main(String[] args) {

        int num = 13;
        boolean isPrime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % 1 == 0) {
                    isPrime = false;
                    break;

                }

            }
        } else {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }



        System.out.println("----Tahmin Code-----");

        int number = 5;
        int count = 0;
        for (int i = 2; i <=number ; i++) {
            if(number%i==0){
                count++;
            }
        }if(count==2){
            System.out.println(number+" It is a Prime number ");
        }
        else {
            System.out.println(number+" It is not a prime number ");
        }

    }
}
