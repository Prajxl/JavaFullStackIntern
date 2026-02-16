package JavaJspiders.src.MODULE1.ControlStatement;

public class V3_if_else_if {
    public static void main(String[] args) {
        int a=7;
        if(a<7)
        {
            System.out.println("Java Full Stack");
        } else if (a>7) {
            System.out.println("Mern Stack");
        } else{
            System.out.println("Devops");
        }

        int p=0;
        if(p%2==0 && p%3==0)
        {
            System.out.println("Banglore");
        } else if (p%2==0) {
            System.out.println("Chennai");
        } else if (p%3==0) {
            System.out.println("Hyderbad");
        }else {
            System.out.println("Goa");
        }

        int age=20;
        if(age>=18 && age<50)
        {
            System.out.println("Full ticket");
        } else if (age<18 && age>3) {
            System.out.println("Half Ticket");
        } else if (age<=3) {
            System.out.println("Free ticket");
        } else {
            System.out.println("Senior citizenship");
        }

        char ch ='a';
        if(ch>='A'&&ch<='Z')
        {
            System.out.println("Uppercase");
        } else if (ch>='a'&&ch<='z') {
            System.out.println("LowerCase");
        } else if (ch>='0'&& ch<='9') {
            System.out.println("Number");
        }else {
            System.out.println("Special character");
        }

        double x=90;
        if(x>=60 && x<70)
        {
            System.out.println("Pass");
        } else if (x>70 && x<80) {
            System.out.println("Second class");
        } else if (x>80 && x<90) {
            System.out.println("First class");
        } else if (x>=90) {
            System.out.println("Disinction");
        }else {
            System.out.println("Fail");
        }
    }
}
