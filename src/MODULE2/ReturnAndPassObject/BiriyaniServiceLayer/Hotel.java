package MODULE2.ReturnAndPassObject.BiriyaniServiceLayer;

import java.util.Scanner;

public class Hotel {
    static void showBiriyani(Biriyani b) {
        if (b != null) {
            System.out.println("Quantity : " + b.qty);
            System.out.println("Price : " + b.price);
        }
    }

    static Biriyani cookBiriyani()
    {
        Scanner sc = new Scanner(System.in);
        double price= sc.nextDouble();
        System.out.println("Enter the quantity");
        int qty= sc.nextInt();
        return  new Biriyani(price,qty);
    }
}
