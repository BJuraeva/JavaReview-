package com.syntax.review5;

public class Task4 {
    /*
    Create a 2D array or integer type where you will store
    odd and even numbers. Develop a program which will
    identify/print the even numbers only.
     */
    public static void main(String[] args) {
        int[][] array = {
                {12, -12, 67, 56},
                {45, 2, 4},
                {56, 2},
                {67, 43, 11, 13}
        };
        int sumOdd = 0;
        int sumEven = 0;
        int number;
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                number = array[r][c];
                if (number % 2 == 0) {
                    sumEven += number;

                }else{
                    sumOdd+=number;
                }

            }

        }
        System.out.println("Sum of even number = "+sumEven);
        System.out.println("Sum of odd number = "+sumOdd);
    }
}
