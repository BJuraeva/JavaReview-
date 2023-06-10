package com.syntax.review3;

public class LogicalOperator {
    public static void main(String[] args) {

        System.out.println("-----and------");

        boolean logInButtonDisplayed = true;
        boolean logInClickable = true;
        if (logInButtonDisplayed && logInClickable) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("-----or------");

        boolean pictureDisplayed = true;
        String accountName = "Syntax!";

        if (pictureDisplayed || accountName.equals("Syntax")){
            System.out.println(" Log in sucessfull");
        }else{
            System.out.println("User is not able to log in");
        }

        System.out.println("------not-----");

        boolean hungry= !true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println("!cold");

        String str="Bye";
        if(!str.equals("Hello")){
            System.out.println("Value of the string in Not Hello");
        }

        boolean confirmSelected=true;
        if(!confirmSelected){ // condition is false( by putting ! became false)
            System.out.println(" Let's click on confirm checkbox");
        }
        System.out.println("Click on Pay button");
    }
}
