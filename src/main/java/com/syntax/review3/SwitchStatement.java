package com.syntax.review3;

public class SwitchStatement {
    public static void main(String[] args) {
        String color="Green";

        switch (color.toLowerCase()){
            case "red":
                System.out.println("Stop");
                break;// tell Java get out from block of code
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown color, action is alo unknown");
        }
    }
}
