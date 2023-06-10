package com.syntax.review8;

public class HospitalTester {
    public static void main(String[] args) {

        Doctors doc=new Doctors("John","Doe");
        doc.printInfo();

        Doctors doc2=new Doctors("Jane", "Smith","cardiologist");
        doc2.printInfo(); // public
        doc2.treat(); // protected
        doc2.prescribeMedicine("antibiotics"); //default
    }
}
