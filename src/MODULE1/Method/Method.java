package MODULE1.Method;

public class Method {
    static void test()
    {
        System.out.println("Executing ().... Above the main method");
    }

    public static void main(String[] args) {
        System.out.println("Program starts");
        test(); // Method Call
        BelowMain();
        BelowMain();
        test();
        System.out.println("Program Ends");
    }

    static void BelowMain()
    {
        System.out.println("Play Method()......Executing below the main method");
    }

}
