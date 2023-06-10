package com.syntax.review9;

interface Drawable{
    // we can have ONLY public static final variables
    // can not have instance variables
    boolean DRAW= true; // do not nee to type -> public static final boolean DRAW=true;
    // by default all method are public and abstract

    void drawing(); // do not nee to type -> public abstract void drawing();

}
public abstract class Shape {
    protected String type;
    public String color;

    Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    protected void printInfo() {
        System.out.println("We build " + color + " " + type);
    }

    public abstract double calculateAr();
}

class Triangle extends Shape {
    int base;
    int height;

    Triangle(String type, String color, int base, int height) {
        super(type, color);
        this.base = base;
        this.height = height;
    }

    public double calculateAr() {
       double area= (base * height)/2;
       return area;
    }

    public void print() {
        System.out.println(type + " has dimension as " + base + " " + height);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String type, String color, double length, double width) {
        super(type, color);
        this.length = length;
        this.width = width;
    }

    public double calculateAr() {
        return length * width;
    }
}
