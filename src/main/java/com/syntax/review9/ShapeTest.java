package com.syntax.review9;

public class ShapeTest {

    public static void main(String[] args) {
        // we can't create the obj of ABSTRACT Class

        System.out.println("1==========================================");

       Triangle tr= new Triangle("triangle", "purple", 12, 18 );
        tr.print();
        System.out.println("Area of triangle "+tr.calculateAr());
        tr.printInfo();

        System.out.println("2========================================");

        Rectangle rec= new Rectangle("rectangle ", "green", 10, 20 );
        rec.printInfo();
        System.out.println("Area of rectangle "+rec.calculateAr());

        System.out.println("3=========================================");

        Shape shape= new Triangle("triangle", "red", 120, 180 );
        shape.printInfo();
        System.out.println(shape.calculateAr());

        System.out.println("4=========================================");

        Shape [] bigShape={new Triangle("triangle", "pink", 200, 300 ),
                           new Rectangle("rectangle ", "yellow", 100, 200 ),
                           new Rectangle("rectangle ", "brown", 150, 250)
        };
        for(Shape sh:bigShape){
            sh.printInfo();
            double area=sh.calculateAr();
            System.out.println("The area of "+sh.color+" "+sh.type+" = "+area);
        }

    }
}
