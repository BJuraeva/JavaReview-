package com.syntax.review6;

public class StringMethod {
    public static void main(String[] args) {

        String str=new String("Hello");
        System.out.println(str);

        String word="Hello"; // most used one
        System.out.println(word);

        // Method of String Class
        System.out.println("Compare 2 Strings ");

        if (str.equals(word)){ // never use sign == with string it might get wrong output
            System.out.println("Both Strings are equal");
        }else{
            System.out.println("String are note equal");
        }
        System.out.println("--------length()-------------");

        String name ="Farwa";
        int numberOfCharacters=name.length();
        System.out.println(numberOfCharacters);

        System.out.println("----------substring()----------");

        String sentence="Hello Batch 16";
        String part = sentence.substring(6);
        System.out.println(sentence);
        System.out.println(part);

        String part1= sentence.substring(0,5);
        System.out.println("Original String never changes: "+sentence);
        System.out.println(part1);

    }

}
