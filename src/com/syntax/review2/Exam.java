package com.syntax.review2;

public class Exam {
    public static void main(String[] args) {
        if( 1 > 2 ) {
            System.out.println(" 1 is greater than 2");
        } else {
            System.out.println(" 2 is greater than 1");
        }

        System.out.println();

        int day = 7;

        switch(day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
        }

        System.out.println();
        boolean a, b, c;
        a = b = c = true;

        if( !a || ( b && c ) ) {
            System.out.println("If executed");
        } else {
            System.out.println("else executed");
        }
    }
}
