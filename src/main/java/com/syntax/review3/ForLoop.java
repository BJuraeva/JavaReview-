package com.syntax.review3;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // we know in advance how many time we want to repeat block of code

        for(int i=1; i<5; i++);{
            System.out.println("Hello");
        }

            Scanner scan=new Scanner(System.in);
            System.out.println("Is it weekend?");
            boolean weekEnd=scan.nextBoolean();

            if(!weekEnd){
                System.out.println("Today you will be learning Java");
            }
    }

}
