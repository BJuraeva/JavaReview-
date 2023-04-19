package com.syntax.review2;

public class NestedIf2 {
    public static void main(String[] args) {
        /*
        we want to check if you have Covid vaccine or not
                          if dose=1 -> you need to be fully vaccinated
                          if dose=2 -> you are fully vaccinated
                          if dose=3 -> you fully and have booster
         */
        boolean vaccine=true;
        int dose=1;

        if(vaccine){
            if(dose==1){
                System.out.println(" you need second dose");
            }else if(dose==2){
                System.out.println("you are fully vaccinated");
            }else if (dose==3){
                System.out.println("you are fully vaccinated with boosted");
            }
        }
    }
}
