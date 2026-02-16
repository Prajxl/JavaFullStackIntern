package JavaJspiders.src.MODULE1.ControlStatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int choice=2;
        switch (choice)
        {
            case 1:
                System.out.println("COD");
                break;
            case 2:
                System.out.println("UPI");
                break;
            case 3:
                System.out.println("Card");
                break;
            case 4:
                System.out.println("NetBanking");
                break;
            default:
                System.out.println("Invalid Selection");
        }

        //Example 2:
        int option=2;
        switch(option)
        {
            case 1:
                System.out.println("English");
                break;
            case 2:
                System.out.println("Kannada");
                break;
            case 3:
                System.out.println("Hindi");
                break;
            default:
                System.out.println("Invalid choice");
        }

        int AtmOption=2;
        switch (AtmOption)
        {
            case 1:
                System.out.println("Press 1 For WIthdrawl");
                break;
            case 2:
                System.out.println("Press 2 for Balance Enquiry");
                break;
            case 3:
                System.out.println("Press 3 For Pin Change");
                break;
            case 4:
                System.out.println("Press 4 For MiniStatement");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt();
        switch (mark/10)
        {
            case 1:if (mark>=40 && mark<50) {
                System.out.println("Pass");
            }
                break;
            case 2: if(mark>=50 && mark<60) {
                 System.out.println("Avg");
            }
                break;
            case 3:if(mark>=60 && mark<70) {
                System.out.println("Good");
            }
                break;
            case 4:if(mark>=70 && mark<80) {
            System.out.println("Excellent");
            }
            break;
            default:
                System.out.println("Fail");
        }
    }
}
