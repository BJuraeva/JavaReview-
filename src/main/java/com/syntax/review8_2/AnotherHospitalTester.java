package com.syntax.review8_2;

import com.syntax.review8.Doctors;

public class AnotherHospitalTester {
    public static void main(String[] args) {
      Doctors doc = new Doctors("Alex","More","physician");
        doc.printInfo(); //  public
        //doc.treat(); //CE: no protected
        //doc.prescribeMedicine(); //CE: no default
    }
}
