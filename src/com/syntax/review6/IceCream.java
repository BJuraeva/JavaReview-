package com.syntax.review6;

public class IceCream {
    /*  variables Syntax
        data name
     */
    String flavor, color;
    boolean dairyFree;
    double price;


    /* Method syntax
       returnType name() {}
     */
    void eat(){ // the name of the method is "eat"
        System.out.println("We can eat "+flavor+" ice cream");
    }
    void buy(){
        System.out.println(flavor+" ice cream cost "+price);
    }

}
