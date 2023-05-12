package com.syntax.review8;

public class Fruits {
    // variables
    public String name, color;

    // constructor - do not participate in inheritance
    Fruits( String name, String color){
        this.name=name;
        this.color=color;
    }
    // Method
    public void eat(){
        System.out.println("We can eat "+name);
    }
}
// 1 parent class - 1 child class = single inheritance
class Mango extends Fruits{
    int price;
    Mango(String name, String color, int price){
        super(name, color);// We must make a call to the parent class Constructor
        this.price=price;
    }

    protected void grow(String country){
        System.out.println(name+" grow in "+country);
    }
}
// 1 parent - 2 child classes = hierarchical
class Apple extends Fruits{
    Apple(String name, String color){
        super(name, color);

    }
    protected  void makeJuice(){
        System.out.println("We can make "+name+" juice");
    }
}
// parent-> child->grandchild = multilevel
class BabyApple extends Apple{
    BabyApple(String name, String color) {
        super(name, color);
    }

    void print(){
        System.out.println(name+" is very small.");
    }
}