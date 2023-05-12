package com.syntax.review8;

public class SuperMarketTester {
    public static void main(String[] args) {

        Apple app = new Apple("Fuji", "green");
        //app.name="Fuji apple"; // comes from parent class
        app.makeJuice();// its own method
        app.eat(); // come from parent
        //app.grow();// sibling classes do not share anything

        app.getClass(); // will get to the obj class(root directory of all the classes)
                        // Method came from Object class -> is the parent of all Objects in java.


        
    }
}
