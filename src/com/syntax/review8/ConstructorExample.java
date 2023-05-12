package com.syntax.review8;

public class ConstructorExample {
    /*
    how to create the constructor ?Rules
    1. must have same name as a class
    2. no return type , not even void
     */

    // If we want to create our constructor we can create only :1)non-argument, 2)parameterized constructor
    // only Java can create default constructor
    ConstructorExample(){ // it is non-argument constructor
        System.out.println("I create non-parameterized constructor");
    }
    ConstructorExample(String str){
        System.out.println("I am parameterized constructor");
    }
    public static void main(String[] args) {

        new ConstructorExample(); // calling default  constructor of ConstructorExample class
                                  // when we do not create -> compiler create a default constructor for us
                                  // why -> constructor is used to initialize the state og the obj
        ConstructorExample var = new ConstructorExample("Hello");

    }
}
