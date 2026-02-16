package JavaJspiders.src.MODULE1.ControlStatement;

public class V1_If {
    public static void main(String[] args) {
        if(true)
        {
            System.out.println("Hello");
        }
        System.out.println("World");
        System.out.println("-----------------");

        if(false)
        {
            System.out.println("Jspiders");
        }
        System.out.println("World");
        System.out.println("-----------------");

        int n=5;
        if(n>4)
        {
            System.out.println(n+" is Greater than 4");
        }
        System.out.println("-----------------");

        int a=8;
        if(a>5 && a<10)
        {
            System.out.println(a+" Greater than 5 and less than 10");
        }
        System.out.println("-----------------");

        int x=10;
        if(x%2==0 || x%3 == 0)
        {
            System.out.println("Biriyani");
        }
    }
}
