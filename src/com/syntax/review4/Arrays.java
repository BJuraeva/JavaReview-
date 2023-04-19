package com.syntax.review4;

public class Arrays {
    public static void main(String[] args) {

        int aa = 10;
        int[] arr = new int[3];

        // we store elements based on indexes
        arr[0] = 10;
        arr[1] = 11;
        arr[2] = 12;

        for(int a:arr){ // enhance loop
            System.out.println(a);
        }

        // access also by indexes
        System.out.println(arr[1]);

        System.out.println("---------2nd Array---------");

        String[] planets = {"Earth", "Marc", "Jupiter", "Saturn", " Neptune"};

        System.out.println("---Enhance for loop---"); // it used ONLY with arrays and collections

        for(String planet:planets){ // enhance for loop works with variable rather then indexes
            System.out.print(planet+" ");
        }

        /*
        System.out.println(planets[0]);
        System.out.println(planets[1]);
         */

        for (int i = 0; i < planets.length; i++) {  // regular loop used indexes to access the element from the array
            System.out.print(planets[i]+" "); //index i - is dynamic(changable)

        }

        System.out.println("---------2nd Array---------");
    }
}
