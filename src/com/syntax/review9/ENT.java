package com.syntax.review9;

public class ENT extends Doctors{

    String location;
    ENT(String firstName, String lastName, String speciality, String location){
        super(firstName,lastName,speciality);
        this.location=location;
    }
    /*
    override prescribeMedicine:
    1. we must have inheritance
    2. method signature must be same (name+parameter)
    3. return type must be same
    4. access modifiers can be same or give higher visibility(protected/public)
     */

    protected void prescribeMedicine(String medicine){
        System.out.println("ENT doctor prescribes "+medicine+" as needed");
    }
    protected  void inspect (String bodyPart){
        System.out.println("ENT doctor checks "+bodyPart);

    }

    public static void main(String[] args) {
        ENT ent =new ENT("John","Snow","ENT","Maryland ");
        ent.printInfo(); // from parent"John","Snow","ENT","Maryland "
        ent.treat();  // from parent
        ent.treat("John Wick"); //from parent
        ent.prescribeMedicine("Fluticasone nasal preparations "); // overriding method
        ent.inspect("Nose"); // ent own method


        System.out.println("================================================");
        // we call this CASTING - changing one type to another type
        // Casting of non primitives: upcasting and down-casting
        // upcasting
        Doctors ent1=new ENT("John","Snow","ENT","Maryland ");
        ent1.printInfo();
        ent1.treat();
        ent1.treat("Jame Smith");
        ent1.prescribeMedicine("analgesic"); // runtime polymorphism
        // during compilation compiler access to all method s based on the reference type
        // during runtime -  java looks always at obj class
    }


}
