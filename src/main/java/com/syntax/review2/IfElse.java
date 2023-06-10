package com.syntax.review2;

public class IfElse {
    public static void main(String[] args) {

        int age=17;
        if (age>=18){
            System.out.println("You can get driver license");
    }else {

            System.out.println("You are too young");
        }

        System.out.println("__________");

        String expected="Best Seller";

        if(expected.equals("Best Seller")){
            System.out.println("Test Passes");
        }else {
            System.out.println("Test Fail");
        }
    }
}
