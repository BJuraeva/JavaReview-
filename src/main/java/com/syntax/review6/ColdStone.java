package com.syntax.review6;

public class ColdStone {
    public static void main(String[] args) {
        System.out.println(" Creating 1st Icecream Object  ");
        IceCream iCream=new IceCream();
        iCream.flavor="Vanila";
        iCream.color="white";
        iCream.dairyFree= false;
        iCream.price=2.99;
        // iCream. brand- brand variable is not defined inside the class

        iCream.eat();
        iCream.buy();

        System.out.println("===============================");

        System.out.println(" Creating 2nd ICeCream Object  ");
        IceCream iCream2=new IceCream();
        iCream2.flavor="Pistachio";
        iCream2.color=" Green";
        iCream2.dairyFree=true;
        iCream2.price=5.99;

        iCream2.eat();
        iCream2.buy();

        // new Car(); compiler error; because we dont have a Car class
        // If there is no class - we can not create an Object

    }
}
