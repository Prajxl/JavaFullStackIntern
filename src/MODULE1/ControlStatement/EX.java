package JavaJspiders.src.MODULE1.ControlStatement;

import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        double accBal=10000.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount Need to Withdraw: ");
        int amt=sc.nextInt();
        if(amt<=accBal)
        {
            if(amt%100==0)
            {
                System.out.println("Withdrawl Success");
            }else
            {
                System.out.println("Invalid Denomination");
            }
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}
