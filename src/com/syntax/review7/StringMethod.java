package com.syntax.review7;

public class StringMethod {
    public static void main(String[] args) {
        String str ="Hello";
        String str1 = "Hello";

        String str2 =new String("Hello");

        System.out.println(str==str1); // true
        System.out.println(str==str2); // false
        str.toUpperCase();
        System.out.println(str); // Hello

        StringBuilder sb= new StringBuilder("Hello"); // mutable string
        sb.reverse();
        System.out.println(sb); // olleH

        sb.append(" Hello"); // w   e have String Builder Object
        System.out.println(sb);

        str = sb.toString(); // convert String Builder Object String Object and re-assign to variable
        System.out.println(str);

        // Write a code to reverse a String

        String given="Class";

        StringBuilder strb=new StringBuilder(given);
        given=strb.reverse().toString();
        System.out.println(given);

        //reverse String without using any inbuilt functions

    }
}
