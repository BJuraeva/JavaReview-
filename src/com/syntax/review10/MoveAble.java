package com.syntax.review10;

public interface MoveAble {
    void move(); // by default, it is public access modifier
}

class Dog implements MoveAble{
    @Override
    public void move(){
        System.out.println("Dogs is moving");
    }

}
class Human implements MoveAble{
    @Override
    public void move(){
        System.out.println("Human moving .......");
    }
}
