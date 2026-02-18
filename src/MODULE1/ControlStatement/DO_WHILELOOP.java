package MODULE1.ControlStatement;

public class DO_WHILELOOP {
    public static void main(String[] args) {
        int a=1;
        do {
            System.out.println("Java");
            a++;
        }while (a<=5);

        // Execute only once even if the while condition false - first execute once and check the while condtion

        int b=7;
        do {
            System.out.println("Jspiders");
            b++;
        }while (b<=5);

        // when to use while and when to use do while

        int x=5;

        do {
            System.out.println(x);
            x--;
        }while (x>=1);

        // execute 0 once

        int y = 0;
        do {
            System.out.println(x+" Jspiders");
        }while (x>=1);
    }
}
