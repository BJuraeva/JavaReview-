package com.syntax.review5;

public class TwoDArrayMore {
    public static void main(String[] args) {
        int [][] numbers=new int[3][4];

        // 1st row
        numbers[0][0]=0;
        numbers[0][1]=1;
        numbers[0][2]=2;
        numbers[0][3]=3;

        //2nd row
        numbers[1][0]=10;
        numbers[1][1]=20;
        numbers[1][2]=30;
        numbers[1][3]=40;

        //3rd row
        numbers[2][0]=100;
        numbers[2][1]=200;
        numbers[2][2]=300;
        numbers[2][3]=400;

        // How to find out how many rows we have?
        System.out.println(numbers.length); // 3

        //how to find number many column we have?
        System.out.println(numbers[0].length); //4

        System.out.println( );

        // i want to print only element that are divisible by 3
        for (int row = 0; row < numbers.length; row++) {// outer loop iterates over the rows
            for (int col = 0; col < numbers[row].length; col++) { // inner loop iterate over the columns
                int num=numbers[row][col];
                if(num%3==0) {
                    System.out.print(" This number is divisible by 3: "+num);
                }
            }
            System.out.println();

        }
        System.out.println(  );


        for (int row = 0; row < numbers.length; row++) {// outer loop iterates over the rows
            for (int col = 0; col < numbers[row].length; col++) { // inner loop iterate over the columns

                System.out.print(numbers[row][col]+" ");

            }
            System.out.println();

        }

    }
}
