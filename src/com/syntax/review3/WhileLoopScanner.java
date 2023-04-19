package com.syntax.review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        /*
        you need to ask user to enter number 1 by 1
        until user not integer value - then loop should stop

        Inside loop we need to calculate the sum of all entered number
         */

        Scanner sc=new Scanner (System.in);
        int sum=0;

        System.out.println("Please enter integer value");

        while(sc.hasNextInt()){

            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum= "+sum);
    }
}
