package JavaJspiders.src.MODULE1.ControlStatement;

import java.util.Scanner;

public class V2_if_else {
    public static void main(String[] args) {
        if(false)
        {
            System.out.println("true statement");
        }else{
            System.out.println("false statement");
        }
        System.out.println("----------------");

        int n = 8;
        if (n%2==0) {
            System.out.println(n+" is a Even Number");
        }else {
            System.out.println(n+" is a Odd Number");
        }
        System.out.println("----------------");

        int age=15;
        if(age>=18)
        {
            System.out.println("Major");
        }else {
            System.out.println("Minor");
        }

        double accBal=10000.0;
        int amnt=1300;
        if(amnt<=accBal)
        {
            System.out.println("Withdrawl Succesfull "+(accBal-amnt));
        }else {
            System.out.println("insufficient Balance");
        }

    }
}
