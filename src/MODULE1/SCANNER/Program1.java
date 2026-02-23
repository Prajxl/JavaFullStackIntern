package MODULE1.SCANNER;
import java.util.Scanner;  //1
public class Program1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in); //2
        System.out.println("Enter the Value");
        // int val=10 Hard Coding
        int val=scn.nextInt(); //3
        System.out.println("Value is: "+val);
    }
}
