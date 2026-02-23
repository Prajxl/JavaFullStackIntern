package MODULE1.SCANNER;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {


        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the Name");
        String name =scn.nextLine();
        System.out.println("Enter the mobile Number");
        long mobile=scn.nextLong();
        System.out.println("Enter the CTC");
        double ctc=scn.nextDouble();
        System.out.println("Are You Single");
        boolean single=scn.nextBoolean();

        System.out.println("Name of the Person: "+name);
        System.out.println("Mobile :"+mobile);
        System.out.println("CTC :"+ctc);
        System.out.println("Single :"+single);

    }


}
