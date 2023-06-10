package com.syntax.review4;

public class ContinueKeyword {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){
            if(i==3) {  // means it will skip 3 and will continue to 4,5
                continue;
            }
            System.out.println(i);
            System.out.println("hi");
            System.out.println("bye");



        }
    }
}
