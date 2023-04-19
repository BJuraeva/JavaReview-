package com.syntax.review4;

public class MoreNestedLoop {
    public static void main(String[] args) {

        System.out.println("--------CAR-----------");

        for (int a = 0; a <=9 ; a++) {
            for (int b = 0; b <9 ; b++) {
                for (int c = 0; c <=9 ; c++) {


                    System.out.println(a + " "+b+" "+c);
                }

            }

        }
        System.out.println("What is the first output?????");

        for (int i = 1; i <=2; i++) {
            for (int j = 0; j < 3; j++) { // condition is true 3 times

                System.out.println("Hello"); // print 3times Hello

            }
            System.out.println("Bye"); // condition execute 1 time cuz we have break
            break; // if we put break inside the inner loop (nested loop) stop-the out put would be only one "Hello"
                   // and it will go to outer loop  and print "Bye" and the cycle will repeat

        }

        System.out.println("What is the  second output?????");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==2){ // if condition in "if statement" is true java skipp the line
                    continue;
                }

                System.out.println("Hello");

            }
            System.out.println("Bye");

        }

        System.out.println("What is the third output?????");

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==2){ //
                    continue;
                }

                System.out.println("Hello");

            }
            System.out.println("Bye");

        }
    }
}
