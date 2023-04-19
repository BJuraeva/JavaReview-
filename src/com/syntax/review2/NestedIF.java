package com.syntax.review2;

public class NestedIF {
    public static void main(String[] args) {
        /*
        Declare two variables for DL and a Car
        if you have DL then I will check if you have a car
         */

        boolean driverLicense = true;
        boolean car = true;

        if (driverLicense) { // outer if
            System.out.println("Let's check if you have a car"); // true
            if (car) {   // nest if
                System.out.println("You can drive to work"); // true
            } else {
                System.out.println("You will need to take a bus or uber"); // ignore-false
            }
        } else {
            System.out.println("You should get a DL"); // false
        }

    }
}
