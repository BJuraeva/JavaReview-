package com.syntax.review7;

public class JavaMethod {
    /*
    Method is a block of code to perform specific task
    In the future we have to develop Method :
      - open/close browsers
       - click on buttons
       - opening exel
       - extracting data from exel
     */

    // 1. with no return value
    void hello(){
        System.out.println("Hello");
    }
    void helloName(String name){
        System.out.println("Hello "+name);
    }

    // 2. create the method  that accept 3 String , concatenates them and return a new Concatenated String

    String concatenate(String str1, String str2, String str3){
       return str1.concat(str2).concat(str3);
    }

    // 3. Create a method that will return the largest number for given two number

    int largest(int num1, int num2){
        int large;
        if(num1>num2){
            large=num1;
        }else {
           large=num2;
        }
        return large;
    }

    // 4. create method that convert Celsius to Fahrenheits and return the value

    double convert(double cel){
        double f = cel*9/5+32;
        return f;
    }

    // 5. create the method that will return an Array of word from given sentence

    String [] words (String sentence){ // words - parameter
        String [] words= sentence.split(" "); // words - variable name
        return words;

    }


}
