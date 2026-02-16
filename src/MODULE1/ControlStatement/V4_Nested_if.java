package JavaJspiders.src.MODULE1.ControlStatement;

import java.util.Scanner;

public class V4_Nested_if {
    public static void main(String[] args) {
        int x = 7;
        if (x % 2 == 0) {
            if (x < 10) {
                System.out.println("Pani Puri");
            } else {
                System.out.println("Bhel Puri");
            }
        } else {
            if (x < 10) {
                System.out.println("Masala Puri");
            } else {
                System.out.println("Sev Puri");
            }
        }
    }
}
