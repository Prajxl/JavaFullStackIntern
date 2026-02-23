package MODULE1.SCANNER;
import java.util.Scanner;

public class Program3 {
    static double addition(double num1, double num2)
    {
        double sum=num1+num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1 number");
        double a=sc.nextDouble();
        System.out.println("Enter the 2 number");
        double b=sc.nextDouble();
        System.out.println("addition: "+addition(a,b));
    }
}
