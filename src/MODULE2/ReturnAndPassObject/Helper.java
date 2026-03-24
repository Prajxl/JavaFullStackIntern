package MODULE2.ReturnAndPassObject;

import java.util.Scanner;

public class Helper {
    static void displayPersonDetails(Person p) {
        if (p != null) {
            System.out.println("Age : " + p.age);
            System.out.println("Height : " + p.height);
            System.out.println("Weight : " + p.weight);
        }
    }

    static Person createPerson()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Age");
        int age=sc.nextInt();
        System.out.println("Enter the Height");
        double height=sc.nextDouble();
        System.out.println("Enter the Weight");
        double weight=sc.nextDouble();
        return new Person(age,height,weight);
    }
}
