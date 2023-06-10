package com.syntax.review4;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 2 ; i++) { //outer loop controls number of iteration of the inner loop
            System.out.println(" "+i+" ");

            for (int j = 1; j <=1 ; j++) { // inner loop-ALWAYS depend on outer loop
                System.out.println(j);
            }
        }

    }
}
