package com.syntax.review5;

public class TwoDArray {
    public static void main(String[] args) {
        String[][] cars={
                {"Ford","Lincoln","Dodge"}, // index 0
                {"BMW","Audi","Mercedes","VM","Fait"},// index 1
                {"Honda","Toyota","Subaru","Nissan"} // index 2
        };
        System.out.println(cars[1][1]);


        // enhance for loop - nested loop

        for(String [] garage :cars){ //iterate over each 1D array
            for(String car:garage){ // iterate over each element of that 1D array
                System.out.print(car+" ");
            }
            System.out.println( );

        }

    }
}
