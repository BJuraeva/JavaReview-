package com.syntax.review7;

public class BankAccountTester {
    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount();
        bank1.accountHolder="John Smith";
        bank1.accountNumber=124512458898L;
        bank1.accountBalance=100;
        bank1.ssn=45685213;

        // access static variable
        System.out.println(BankAccount.bankName);

        BankAccount bank2 = new BankAccount();
        bank2.accountHolder="Nile Kapoor";
        bank2.accountNumber=124878898L;
        bank2.accountBalance=258;
        bank2.ssn=4546895;

        System.out.println(bank2.bankName);// this it is not a preferable way to access the code - but it is possible

        System.out.println("------before-------");
        System.out.println(BankAccount.bankName);
        System.out.println("------after--------");
        bank2.bankName ="Chase"; // it will change name of bank for the rest of the future code
        System.out.println(bank2.bankName);

    }
}

