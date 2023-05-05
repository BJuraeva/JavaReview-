package com.syntax.review7;

public class JavaMethodsTest {
    public static void main(String[] args) {
        // 1
        JavaMethod jm= new JavaMethod();
        jm.hello();
        jm.helloName("Leo");
        // jm.helloName('J'); parameter is String not char

        // 2

        // 3

        // 4
        double temp=jm.convert(36.5);
        System.out.println(temp);

        // 5
        String []arr=jm.words("Today is May 4th");
        for (String s : arr) {
            System.out.println(s);
        }


    }
}
