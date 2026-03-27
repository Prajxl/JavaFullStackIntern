package MODULE2.ReturnAndPassObject.Card;

import java.util.Scanner;

public class Visa {
    static void displayCardInfo(DebitCard c)
    {
        System.out.println("Card Number : "+c.cardNumber);
        System.out.println("Pin Number  : "+c.pinNumber);
    }
    static DebitCard issueDebitCard()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the card Number");
        long card=sc.nextLong();
        System.out.println("Enter the Pin Number");
        int pin= sc.nextInt();
        return new DebitCard(card,pin);
    }
}
