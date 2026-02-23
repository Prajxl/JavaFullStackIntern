package MODULE1.SCANNER;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character value (String )");
        char ch=sc.next().charAt(0); // We are Reading String and Extracting first character from the string
        System.out.println("Value"+ch);
    }
}
