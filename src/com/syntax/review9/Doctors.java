package com.syntax.review9;

public class Doctors {
    // creating instant variable
    public String firstName, lastName;
    protected String speciality;
    int yearOfExperience;
    private double salary;
    public static boolean degree;

    // creating static variable

    Doctors(String firstName, String lastName){ // through constructor we can initialize instance variables (state of the obj)
        this.firstName=firstName;
        this.lastName=lastName;
    }
    // to have more than 1 constructor we need to change the number of the parameters or type of the parameters
    public Doctors(String firstName, String lastName, String speciality){
        this(firstName, lastName);// make a call to existing constructor
        this.speciality=speciality;// referring to current class of instance variables
    }
    public void printInfo(){ // method can have any name like printInfo
        System.out.println("Doctor's name is "+firstName+" "+lastName+" and speciality "+speciality);
    }
    protected void treat (){
        System.out.println("Doctors treat patience");
    }

    // in overloading we look only at the signature(name+parameters)
    // signature must be different
    protected void treat (String patient){
        System.out.println("Doctors treat "+patient);
    }

    void prescribeMedicine(String medicine){
        System.out.println("Doctor prescribed "+medicine);
    }

    // private members do not participate in inheritance
    private double getSalary(){
        return salary;
    }



}
